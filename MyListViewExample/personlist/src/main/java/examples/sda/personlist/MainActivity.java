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
        public Object getItem(int position) {
//            return people.get(position);
            return people.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView tw = new TextView(MainActivity.this);

            String personString = people.get(position).getName() + " " +
                    people.get(position).getLastName() + ", lat " +
                    people.get(position).getAge();

            tw.setText(personString);

            return tw;
        }
    }
}
