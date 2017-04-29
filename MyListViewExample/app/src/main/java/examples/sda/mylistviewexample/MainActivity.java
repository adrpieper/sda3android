package examples.sda.mylistviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView numbersListView = (ListView) findViewById(R.id.numbers_list_view);
        numbersListView.setAdapter(new NumbersAdapter());

    }

    class NumbersAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 1000;
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

            TextView tw = new TextView(MainActivity.this);
            tw.setText(getItem(position).toString());
            return tw;
        }
    }
}
