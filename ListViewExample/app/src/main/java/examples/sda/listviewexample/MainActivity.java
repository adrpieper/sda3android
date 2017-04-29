package examples.sda.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    //ListView numberList;

    ListView personProviderList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //numberList = (ListView) findViewById(R.id.numberListView);
        //numberList.setAdapter(new NumbersAdapter());

        personProviderList = (ListView) findViewById(R.id.numberListView);
        personProviderList.setAdapter(new PersonAdapter());

    }

    class PersonAdapter extends BaseAdapter {

        List<Person> myList = PersonProvider.provideList();

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
            TextView textView;
            if(convertView == null) {
                textView = new TextView(MainActivity.this);
            } else {
                textView = (TextView) convertView;
            }

            textView.setText(getItem(position).toString());
            return textView;
        }
    }
}
