package examples.sda.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView numbeListView = (ListView) findViewById(R.id.numberListView);
        numbeListView.setAdapter(new NumbersAdapter());

    }

    class  NumbersAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 'x'-'a' +1;
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


            return textView;
        }
    }
}
