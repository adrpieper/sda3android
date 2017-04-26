package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by RENT on 2017-04-25.
 */

public class InvestmentFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_investment, container, false);


        final EditText input = (EditText) view.findViewById(R.id.input_text);
        final TextView profit = (TextView) view.findViewById(R.id.profit);
        final Spinner procenty = (Spinner) view.findViewById(R.id.spinner_procenty);
        final Spinner lata = (Spinner) view.findViewById(R.id.spinner_lata);



        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getActivity(),
                R.array.procenty_array, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        procenty.setAdapter(adapter1);



        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getActivity(),
                R.array.time_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        lata.setAdapter(adapter2);




        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                try {
                    double liczba_kwota = Double.parseDouble(input.getText().toString());
                    double liczba_procenty = Double.parseDouble(procenty.getSelectedItem().toString().split("%")[0]);
                    double licza_lata = Double.parseDouble(lata.getSelectedItem().toString().split(" ")[0]);

                    String after = "" + liczba_kwota * licza_lata * liczba_procenty/100;
                    profit.setText(after);
                } catch (NumberFormatException e) {
                    Toast.makeText(getActivity(),"Podaj liczbę", Toast.LENGTH_SHORT).show();
                }



            }
        });



        return view;
    }


}
