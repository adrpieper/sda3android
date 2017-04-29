package examples.sda.personlist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends Activity {

    private PersonProvider personProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView personsListView = (ListView) findViewById(R.id.personsListView);
        personsListView.setAdapter(new NumberAdapter());
    }
    class NumberAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 1000;
        }

        @Override
        public Object getItem(int position) {
            return position+1;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            TextView textView = new TextView(MainActivity.this);
            textView.setText(getItem(position).toString());

            return textView;
        }
    }

}
