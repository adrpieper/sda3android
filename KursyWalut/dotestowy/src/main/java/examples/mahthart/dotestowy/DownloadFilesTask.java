package examples.mahthart.dotestowy;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * Created by Medard on 2017-05-08.
 */

public class DownloadFilesTask extends AsyncTask<Object, Object, JSONArray> {

    @Override
    protected JSONArray doInBackground(Object... params) {
        URL url = null;
        JSONArray jsonArray = null;
        try {
            url = new URL("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection connection = null;
        try {
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            jsonArray = new JSONArray(connection.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    protected void onPostExecute(JSONArray result) {
    }
}
// https://developer.android.com/reference/android/os/AsyncTask.html#doInBackground(Params...)