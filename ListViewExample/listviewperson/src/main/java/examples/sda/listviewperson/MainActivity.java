package examples.sda.listviewperson;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    PersonProvider personProvider;


    Resources resources = getResources();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personProvider =new PersonProvider(getResources());
        ListView peopleList = (ListView) findViewById(R.id.peopleList);
        peopleList.setAdapter(new PeopleListAdapter());

    }

    class PeopleListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return personProvider.personList.size();
        }

        @Override
        public Object getItem(int position) {
            return position + 1;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(MainActivity.this);
            for (int i = 0; i < personProvider.personList.size(); i++) {
                textView.setText((personProvider.personList.get(i).getName() + " " +
                        personProvider.personList.get(i).getSurname() + " " + personProvider.personList.get(i).getAge()).toString());
            }
            return textView;
        }
    }

}
