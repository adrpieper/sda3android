package examples.sda.apka;

import android.app.Fragment;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CurenncyCalculatorFragment extends Fragment {

    double kurs;
    String wynik;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_curenncy_calculator, container, false);

        Button ok = (Button) view.findViewById(R.id.calc);
        final EditText pln = (EditText) view.findViewById(R.id.pln);
        final TextView wal = (TextView) view.findViewById(R.id.wal);
        final RadioGroup gr = (RadioGroup) view.findViewById(R.id.chack);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = pln.getText().toString();
                tmp = tmp.replace(",",".");
                setKurs(gr.getCheckedRadioButtonId());
                Calculate(tmp);
                wal.setText(wynik);
            }
            private double setKurs(int k){
                if(k == R.id.radioButton_chf){
                    kurs = Waluta.CHF.waluta;
                }else if(k == R.id.radioButton_euro){
                    kurs = Waluta.EURO.waluta;
                }else{
                    kurs = Waluta.USD.waluta;
                };
                return kurs;
            }

            private String Calculate(String input) {
                try{
                double tmp = Double.valueOf(input);
                double tmp1 = (double)tmp*kurs;
                        DecimalFormat twoDecimalForm = new DecimalFormat("0.00 zł");
                        wynik = twoDecimalForm.format(tmp1);
                    wynik = wynik.replace(".",",");
                } catch (NumberFormatException e){
                    Toast.makeText(view.getContext (),"Proszę wprowadzić cyfry.",Toast.LENGTH_LONG).show();
                }
                return wynik;
            }
        });
        return view;
    }
}
