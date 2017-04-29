package examples.sda.listviewperson;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends Activity {

    PersonProvider personProvider;
    private PeopleListAdapter adapter;
    private List<Person> personList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        personProvider = new PersonProvider(getResources());

        ListView peopleListView = (ListView) findViewById(R.id.peopleList);
        personList = personProvider.createPerson();
        adapter = new PeopleListAdapter(personList);
        peopleListView.setAdapter(adapter);

        Switch sortSwitch = (Switch) findViewById(R.id.sortSwitch);

        sortSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked == true) {
                    Collections.sort(personList, new Comparator<Person>() {
                        @Override
                        public int compare(Person o1, Person o2) {
                            return o1.getAge() - o2.getAge();
                        }
                    });
                }else{
                    Collections.sort(personList, new Comparator<Person>() {
                        @Override
                        public int compare(Person o1, Person o2) {
                            return o2.getAge() - o1.getAge();
                        }
                    });
                }
                adapter.notifyDataSetChanged();
            }
        });

    }

    class PeopleListAdapter extends BaseAdapter {

        private List<Person> personList;

        public PeopleListAdapter(List<Person> personList) {
            this.personList = personList;
        }

        @Override
        public int getCount() {
            return personList.size();
        }

        @Override
        public Object getItem(int position) {
            return personList.get(position).getName() + " " + personList.get(position).getSurname() + " " + personList.get(position).getAge();
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(MainActivity.this);

            textView.setText(getItem(position).toString());

            return textView;
        }
    }

}
