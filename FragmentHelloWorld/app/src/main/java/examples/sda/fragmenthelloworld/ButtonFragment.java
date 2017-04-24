package examples.sda.fragmenthelloworld;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Adrian on 2017-04-22.
 */

public class ButtonFragment extends Fragment {

    //Wczytuje z pliku pod zimienna view widok i go oprogramowuje

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //żeby wczytać plik potrzebujemy inflater, można go stworzyć poprzez getContex

        final Button button = new Button(getActivity());
        button.setText("OK");

        //ten fragment znajduje się w tej aktywności, zapewnia nam komunikacje, poktrzebbujemy referencję z klasy Main Activity
        //wszystkie zmienne muszą być final

        final MainActivity mainActivity = (MainActivity) getActivity();

        //po wciśnięciu pokaż wiadomość

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showMessage();
            }
        });

        return button;
    }
}
