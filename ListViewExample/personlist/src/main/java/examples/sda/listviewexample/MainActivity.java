package examples.sda.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends Activity {
    private PersonProvider personProvider = new PersonProvider();
    private List<Person> personList = personProvider.provide();
    private Switch mySwitch;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView numbersListView = (ListView) findViewById(R.id.numberListView);
        mySwitch = (Switch)  findViewById(R.id.switch1);

        mySwitch.setChecked(true);

        final NumbersAdapter adapter = new NumbersAdapter();

        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Collections.sort(personList,new Comparator<Person>(){
                        public int compare(Person p1,Person p2){
                            return p1.getAge() - p2.getAge();
                        }});
                }else{
                    Collections.sort(personList,new Comparator<Person>(){
                        public int compare(Person p1,Person p2) {
                            return p2.getAge() - p1.getAge();
                        }});
                }

                adapter.notifyDataSetChanged();
            }
        });
        numbersListView.setAdapter(adapter);
    }

    class NumbersAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return personList.size();
        }

        @Override
        public Person getItem(int position) {
            Person person = personList.get(position);
            return person;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            TextView textView;
            if ( convertView == null){
                textView = new TextView(MainActivity.this);
            }else{
                textView = (TextView) convertView;
            }

            textView.setText(showPerson(getItem(position)));
            return textView;
        }

        public String showPerson(Person person){
            String infoPerson = "";
            infoPerson = infoPerson + "Name: " + person.getName() + "\n";
            infoPerson += "Surname: " + person.getSurname() + "\n";
            infoPerson += "Email: " + person.getEmail() + "\n";
            infoPerson += "Age: " + String.valueOf(person.getAge()) + "\n";
            return infoPerson;
        }

    }


}
