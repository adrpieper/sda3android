package examples.mahthart.dotestowy;

import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Medard on 2017-05-08.
 */

public class DownloadFilesTask extends AsyncTask<Void, Void, InputStream> {

    @Override
    protected InputStream doInBackground(Void... params) {
        InputStream inputStreamFile = null;
        URL url = null;

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
            inputStreamFile= new BufferedInputStream(connection.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        return inputStreamFile;
    }
}
// https://developer.android.com/reference/android/os/AsyncTask.html#doInBackground(Params...)