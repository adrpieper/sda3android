package examples.sda.personlist;

import android.content.res.Resources;
import android.util.Log;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Adrian on 2017-04-29.
 */

public class PersonFromFileProvider extends PersonProvider {

    private final Resources resources;

    public PersonFromFileProvider(Resources resources) {
        this.resources = resources;
    }

    @Override
    public List<Person> provide() {
        List<Person> persons = new ArrayList<>();
        InputStream inputStream = resources.openRawResource(R.raw.persons);

        Scanner scanner = new Scanner(inputStream);

        int lineNumber = 0;
        while (scanner.hasNext()) {
            final String line = scanner.nextLine();
            lineNumber++;
            try {
                Person p = parse(line);
                persons.add(p);
            }catch (Exception e) {
                Log.e("Person Parse", "Parse line " + lineNumber + " failed", e);
            }
        }
        scanner.close();
        return persons;
    }

    private Person parse(String line) {
        throw new RuntimeException("Wszystko źle");
    }
}
