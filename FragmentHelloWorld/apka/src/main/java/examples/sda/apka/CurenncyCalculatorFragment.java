package examples.sda.apka;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class CurenncyCalculatorFragment extends Fragment {

    double kurs = 2.5;
    String wynik ="";

    public CurenncyCalculatorFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_curenncy_calculator, container, false);

        Button ok = (Button) view.findViewById(R.id.calc);
        final EditText pln = (EditText) view.findViewById(R.id.pln);
        final TextView wal = (TextView) view.findViewById(R.id.wal);
        final RadioGroup gr = (RadioGroup) view.findViewById(R.id.chack);

        gr.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(gr.getCheckedRadioButtonId() == R.id.radioButton_chf){
                    wal.setText (R.string.chf);
                }else if(gr.getCheckedRadioButtonId() == R.id.radioButton_euro){
                    wal.setText (R.string.euro);
                }else{
                    wal.setText (R.string.usd);
                };
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = pln.getText().toString();
                Calculate(tmp);
                wal.setText(wynik);
            }
            private String Calculate(String input) {
                double tmp = Double.valueOf(input);
                double tmp1 = (double)tmp*kurs;
                wynik = Double.toString(tmp1);
                return wynik;
            }
        });
        return view;
    }
}
