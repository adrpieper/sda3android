package examples.sda.apka;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;


public class InvestmentFragment extends Fragment {

    double sumaWynik;
    double odsetkiWynik;
    double kapitalWynik;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_investment, container, false);

        final TextView lataX = (TextView) view.findViewById (R.id.lata_wynik);
        final SeekBar seekBarLata = (SeekBar) view.findViewById ((R.id.seekBar_lata));

        seekBarLata.setOnSeekBarChangeListener (new SeekBar.OnSeekBarChangeListener () {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lataX.setText (Integer.toString (progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





        return view;
    }

}
