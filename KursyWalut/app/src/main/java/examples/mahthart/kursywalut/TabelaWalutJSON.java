package examples.mahthart.kursywalut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Medard on 2017-05-05.
 */

public class TabelaWalutJSON {



        final String path = "src\\resources\\";

	/* metoda, odczytujaca dane z pliku i zwracajaca je jako string */
        public String getJSONFromFile(String filename) {
		/* deklarujemy pusty ciag znakow */
            String myJSON = "";
		/* deklarujemy obiekt przetrzymujacy nasz plik (handler) */
            File f = new File(this.path + filename);
            try {
			/* definiujemy nowy skaner */
                Scanner sc = new Scanner(f);
			/* czytmy wszystkie linie */
                while(sc.hasNextLine()) {
				/* aktualnie przeczytana linie dodajemy do zmiennej, ktora bedziemy zwracac */
                    myJSON += sc.nextLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
		/* zwracamy przeczytany plik */
            return myJSON;
        }

}
