package examples.mahthart.dotestowy;

import android.util.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Medard on 2017-05-09.
 */

public class WalutaProvider {



    private List<Waluta> walutyLista;

    public List<Waluta> getWalutyLista() throws IOException {
        DownloadFilesTask downloadFilesTask = new DownloadFilesTask();
        downloadFilesTask.execute();
        readJsonStream(downloadFilesTask.doInBackground());
        return walutyLista;
    }

    public List<Waluta> readJsonStream(InputStream is) throws IOException {

        JsonReader reader = new JsonReader(new InputStreamReader(is));
        try {
            return provideWalutyLista(reader);
        } finally {
            reader.close();
        }
    }

    public List<Waluta> provideWalutyLista(JsonReader reader) throws IOException {

        walutyLista = new ArrayList<>();

        reader.beginArray();
        while (reader.hasNext()) {
            walutyLista.add(readWaluta(reader));
        }
        reader.endArray();
        return walutyLista;
    }

    public Waluta readWaluta(JsonReader reader) throws IOException {

        Waluta waluta = new Waluta();

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("currency")) {
                waluta.setNazwaWaluty(reader.nextString());
            } else if (name.equals("code")) {
                waluta.setKodWaluty(reader.nextString());
            } else if (name.equals("mid")) {
                waluta.setKursWaluty(reader.nextString());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return waluta;
    }
}
// https://developer.android.com/reference/android/util/JsonReader.html