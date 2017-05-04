package examples.sda.personlist;

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
import java.util.List;

public class MainActivity extends Activity {
    private PersonProvider personProvider = new PersonProvider();
    private List<Person> personList = personProvider.provide();
    private Switch mySwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView numbersListView = (ListView) findViewById(R.id.numberListView);
        mySwitch = (Switch)  findViewById(R.id.switch1);

        mySwitch.setChecked(true);

        final NumbersAdapter adapter = new NumbersAdapter(LayoutInflater.from(this));

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
        private LayoutInflater layoutInflater;

        public NumbersAdapter(LayoutInflater layoutInflater) {
            this.layoutInflater = layoutInflater;
        }

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

            View personView = layoutInflater.inflate(R.layout.person_list_item, parent, false);

            if ( convertView == null){
                personView = layoutInflater.inflate(R.layout.person_list_item, parent, false);

            }else{
                personView = convertView;
            }
            Person person = getItem(position);
            TextView nameTextView = (TextView) personView.findViewById(R.id.nameTextView);
            TextView surnameTextView = (TextView) personView.findViewById(R.id.surnameTextView);
            TextView emailTextView = (TextView) personView.findViewById(R.id.emailTextView);
            TextView ageTextView = (TextView) personView.findViewById(R.id.ageTextView);

            nameTextView.setText("Name: " + person.getName());
            surnameTextView.setText("Surname: " + person.getSurname());
            emailTextView.setText("Email: " + person.getEmail());
            ageTextView.setText("Age: " + String.valueOf(person.getAge()));

            return personView;
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
