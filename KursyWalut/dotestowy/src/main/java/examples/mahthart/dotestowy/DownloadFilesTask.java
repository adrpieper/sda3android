package examples.mahthart.dotestowy;

import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by Medard on 2017-05-08.
 */

public class DownloadFilesTask extends AsyncTask<Void, Void, InputStream> {

    private String noweURLString = null;


    public String getNoweURLString() {
        return noweURLString;
    }

    public void setNoweURL(String noweURLString) {
        this.noweURLString = noweURLString;
    }

    public DownloadFilesTask(String noweURL) {
        this.noweURLString = noweURLString;
    }

    @Override
    protected InputStream doInBackground(Void... params) {

        URL url= null;
        URL noweURL =null;
        try {
            noweURL = new URL(noweURLString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            url = new URL("http://api.nbp.pl");
            url.sameFile(noweURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection connection = null;
        try {
            connection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream inputStreamFile = null;
        try {
            inputStreamFile = new BufferedInputStream(connection.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStreamFile;
    }
}
// https://developer.android.com/reference/android/os/AsyncTask.html#doInBackground(Params...)