package examples.sda.personlist;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView personListView = (ListView) findViewById(R.id.personList);

        PersonProvider personProvider = new PersonProvider();
        final List<Person> personList = personProvider.provide();
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getAge() - p1.getAge();
            }
        });

        PersonAdapter personAdapter = new PersonAdapter(personList);
        personListView.setAdapter(personAdapter);
    }

    class PersonAdapter extends BaseAdapter {
        private final List<Person> personList;

        public PersonAdapter(List<Person> personList) {
            this.personList = personList;
        }

        @Override
        public int getCount() {
            return personList.size();
        }

        @Override
        public Person getItem(int position) {
            return personList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            TextView textView;
            if (convertView == null) {
                textView = new TextView(MainActivity.this);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
            }
            else {
                textView = (TextView) convertView;
            }
            Person person = getItem(position);
            textView.setText(person.getName() + ' ' + person.getAge());
            return textView;
        }
    }
}
