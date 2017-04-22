package examples.sda.fragmenthelloworld;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.R.attr.button;

/**
 * Created by RENT on 2017-04-22.
 */

public class ButtonFragment extends Fragment {

    Message message;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.simple_layout,container,false);

        message = (MainActivity) getActivity();
        Button button = (Button) view.findViewById(R.id.button_pn);

        //final MainActivity mainActivity = (MainActivity) getActivity();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mainActivity.showMessage();
                //ToDo - wykorzystac interfejs do wyswietlania metody - zad2.
                message.showMessage();
            }
        });

        return view;
    }
}
