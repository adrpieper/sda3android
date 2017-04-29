package examples.sda.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends Activity {

    //ListView numberList;

    ListView personProviderList;
    Switch sort;

    PersonAdapter adapter;
    final List<Person> personList = PersonProvider.provideList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sort = (Switch) findViewById(R.id.toggleButton_sort);
        personProviderList = (ListView) findViewById(R.id.numberListView);
        adapter = new PersonAdapter(personList, LayoutInflater.from(this)); // dodac LayoutInflater.from(this)

        personProviderList.setAdapter(adapter);

        sort.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if(isChecked) {

                  Collections.sort(personList, new Comparator<Person>() {
                      @Override
                      public int compare(Person o1, Person o2) {
                          return o1.getAge() - o2.getAge();
                      }
                  });
                  adapter.notifyDataSetChanged();

              } else {
                  Collections.shuffle(personList);
                  adapter.notifyDataSetChanged();
              }
          }
      });

    }

    class PersonAdapter extends BaseAdapter {
        private List<Person> myList;
        private final LayoutInflater layoutInflater;

        // dodac patrametr lay - inf do konstruktora
        PersonAdapter(List<Person> list, LayoutInflater layoutInflater ) {
            this.myList = list;
            this.layoutInflater = layoutInflater;
        }

        @Override
        public int getCount() {
            return myList.size();
        }

        @Override
        public Object getItem(int position) {
            StringBuilder sb = new StringBuilder();
            return sb.append(myList.get(position).getName()).append(" ")
                    .append(myList.get(position).getAge()).toString();
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            View personView;
            if(convertView == null) {
                personView = layoutInflater.inflate(R.layout.activity_main,parent,false);
            } else {
                personView =  convertView;
            }

            //(TextView) textView.setText(getItem(position).toString());
            return personView;
        }
    }
}
