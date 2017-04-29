package examples.sda.personlist;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    class PersonAdapter extends BaseAdapter {
        PersonProvider personProvider = new PersonProvider();
        List<Person> personList = personProvider.provider();

        @Override
        public int getCount() {
            return personList.size() ;
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
            TextView textView;
            if (convertView == null){
                textView = new TextView(MainActivity.this);
            }else{
                textView = (TextView) convertView;
            }
             personList.(getItem(position).toString());
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
            return textView;
        }
    }
}