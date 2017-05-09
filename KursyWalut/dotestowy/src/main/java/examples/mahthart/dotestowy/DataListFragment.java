package examples.mahthart.dotestowy;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class DataListFragment extends ListFragment {


    JSONArray data;

    public DataListFragment(){}

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        DownloadFilesTask downloadFilesTask = new DownloadFilesTask();
        downloadFilesTask.execute(data);
        final JSONArrayAdapter adapter = new JSONArrayAdapter(this.getActivity(),data);
        setListAdapter(adapter);
    }

    private class JSONArrayAdapter extends BaseAdapter {
        JSONArray data;
        Context context;

        public JSONArrayAdapter(Context context,JSONArray data) {
            super();
            this.context=context;
            this.data=data;
        }
//        @Override
//        public void onListItemClick(ListView l, View v, int position, long id) {
//            // Insert desired behavior here.
//            Log.i("onListItemClick"+ id);
//        }

        @Override
        public int getCount() {
            return data.length();
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            try {
                return data.getJSONObject(arg0);
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public long getItemId(int arg0) {
            return arg0;
        }

        @Override
        public boolean hasStableIds(){
            return true;
        }

        @Override
        public boolean isEmpty(){
            return data==null || data.length()==0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View walutaView;
            if (convertView == null) {
                walutaView = inflater.inflate(R.layout.waluta_item, parent, false);
            } else {
                walutaView = convertView;
            }

            TextView nazwaWalutyX = (TextView) walutaView.findViewById(R.id.nazwa_waluty);
            TextView kodWalutyX = (TextView) walutaView.findViewById(R.id.kod_waluty);
            TextView kursWalutyX = (TextView) walutaView.findViewById(R.id.kurs_waluty);

            //ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
            try {
                JSONObject waluta = (JSONObject) data.get(position);
                nazwaWalutyX.setText(waluta.getString("currency"));
                kodWalutyX.setText(waluta.getString("code"));
                kursWalutyX.setText(waluta.getString("mid"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return walutaView;
        }
    }
}
