package examples.sda.personlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonProvider personProvider = new PersonProvider();
        final List<Person> personList = personProvider.provide();
        PersonAdapter personAdapter = new PersonAdapter(personList);

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
        public Object getItem(int position) {
            return personList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(MainActivity.this);

            String personString = personList.get(position).getName() + " " +
                    personList.get(position).getAge();

            textView.setText(personString);

            return textView;
        }
    }
}
