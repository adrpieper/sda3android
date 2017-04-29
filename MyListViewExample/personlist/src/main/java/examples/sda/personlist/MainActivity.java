package examples.sda.personlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonProvider pp = new PersonProvider();
        final ArrayList<Person> personArrayList = pp.provide();
        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getAge() - p1.getAge();
            }
        });

        ListView pplListView = (ListView) findViewById(R.id.ppl_list_view);
        PeopleAdapter pa = new PeopleAdapter(personArrayList, LayoutInflater.from(this));
        pplListView.setAdapter(pa);
    }

    class PeopleAdapter extends BaseAdapter {

        ArrayList<Person> people;
        private final LayoutInflater layoutInflater;

        public PeopleAdapter(ArrayList<Person> people, LayoutInflater layoutInflater) {
            this.people = people;
            this.layoutInflater = layoutInflater;
        }

        @Override
        public int getCount() {
            // tu trzeba jakoś zdefiniować/przekazac liczbę osób
            return people.size();
        }

        @Override
        // możemy poniżej bezpiecznie zmienić typ z Object na Person (rzutować w dół)
        public Person getItem(int position) {
            return people.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //TextView tw;
            View personView;

            if (convertView == null) {
//                tw = new TextView(MainActivity.this);
//                tw.setTextSize(24);
                personView = layoutInflater.inflate(R.layout.person_list_item, parent, false);
            }
            else {
                personView = convertView;
            }

            // tu już nie muszę rzutować bo metoda getItem zwraca obiekt klasy Person
            Person person = getItem(position);
            TextView nameTextView = (TextView) personView.findViewById(R.id.name_text_view);
            TextView ageTextView = (TextView) personView.findViewById(R.id.age_text_view);
            TextView lastNameTW = (TextView) personView.findViewById(R.id.lastName_text_view);
            nameTextView.setText(person.getName());
            lastNameTW.setText(person.getLastName());
            ageTextView.setText(Integer.toString(person.getAge()));

/*            String personString = person.getName() + " " +
                    person.getLastName() + ", lat " +
                    person.getAge();

            tw.setText(personString);*/
            return personView;
        }
    }
}
