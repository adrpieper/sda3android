package examples.sda.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
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

        ListView numbersListView = (ListView) findViewById(R.id.numbersListView);
        numbersListView.setAdapter(new NumbersAdapter());
        ListView charsListView = (ListView) findViewById(R.id.charsListView);
        charsListView.setAdapter(new CharsAdapter());
    }

    class CharsAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 'z'-'a' + 1;
        }

        @Override
        public Object getItem(int position) {
            return (char) (position+'a');
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(MainActivity.this);
            textView.setText(getItem(position).toString());
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
            return textView;
        }
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
            TextView textView = new TextView(MainActivity.this);
            textView.setText(getItem(position).toString());
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32);
            return textView;
        }
    }
}

