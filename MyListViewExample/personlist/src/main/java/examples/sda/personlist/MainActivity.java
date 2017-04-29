package examples.sda.personlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonProvider pp = new PersonProvider();

        ListView pplListView = (ListView) findViewById(R.id.ppl_list_view);
        pplListView.setAdapter(new PeopleAdapter(pp.provide()));
    }

    class PeopleAdapter extends BaseAdapter {

        ArrayList<Person> people;

        public PeopleAdapter(ArrayList<Person> people) {
            this.people = people;
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
            TextView tw;

            if (convertView == null) {
                tw = new TextView(MainActivity.this);
            }
            else {
                tw = (TextView) convertView;
            }

            // tu już nie muszę rzutować bo metoda getItem zwraca obiekt klasy Person
            Person person = getItem(position);

            String personString = person.getName() + " " +
                    person.getLastName() + ", lat " +
                    person.getAge();

            tw.setText(personString);
            tw.setTextSize(24);

            return tw;
        }
    }
}
