package examples.sda.calculator;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by RENT on 2017-04-25.
 */

public class InvestmentFragment extends Fragment {

    private TextView okresZwrotuInwestycji;
    private EditText nakladInwesycji;
    private EditText przychodZInwestycji;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_investment,container,false);

        nakladInwesycji= (EditText) view.findViewById(R.id.editText_naklad_inwestycyjny);
        przychodZInwestycji = (EditText) view.findViewById(R.id.editText_przychod_z_inwestycji);
        okresZwrotuInwestycji = (TextView) view.findViewById(R.id.textView_PBN);

         view.findViewById(R.id.button_calculate).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 try {

                     double przychodInvestycja = Double.parseDouble(nakladInwesycji.getText().toString());
                     double nakladInvest = Double.parseDouble(przychodZInwestycji.getText().toString());
                     okresZwrotuInwestycji.setText(calculateInvestment(przychodInvestycja, nakladInvest));

                 } catch (NumberFormatException ex){
                     Toast.makeText(inflater.getContext(), "Insert only numbers", Toast.LENGTH_SHORT).show();
                 }
             }
         });

        return view;
    }


    public String calculateInvestment(double przychodInwestycja, double nakladInwestycja) {
        double resD;
        resD = (nakladInwestycja/przychodInwestycja);
        return String.valueOf(resD);
    }


}
