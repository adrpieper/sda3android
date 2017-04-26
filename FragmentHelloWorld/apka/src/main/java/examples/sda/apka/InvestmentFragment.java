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
    double odsetka;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_investment, container, false);

        final TextView lataX = (TextView) view.findViewById (R.id.lata_wynik);
        final SeekBar seekBarLata = (SeekBar) view.findViewById ((R.id.seekBar_lata));
        final TextView wplataX = (TextView) view.findViewById (R.id.wplata_wynik);
        final SeekBar seekBarWplata = (SeekBar) view.findViewById ((R.id.seekBar_wplata));
        final TextView rataX = (TextView) view.findViewById (R.id.raty_wynik);
        final SeekBar seekBarRata = (SeekBar) view.findViewById ((R.id.seekBar_raty));
        final TextView sumaWynikX = (TextView) view.findViewById (R.id.suma_wynik);

        seekBarLata.setOnSeekBarChangeListener (new SeekBar.OnSeekBarChangeListener () {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lataX.setText (Integer.toString (progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBarL) {
                oblicz(Integer.parseInt(seekBarL+""),1,1);
            }
        });
        seekBarWplata.setOnSeekBarChangeListener (new SeekBar.OnSeekBarChangeListener () {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                wplataX.setText (Integer.toString (progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBarW) {
                oblicz(1,Integer.parseInt(seekBarW+""),1);
                sumaWynik = Double.toString(seekBarW);
                sumaWynikX.setText(sumaWynik);
            }
        });
        seekBarRata.setOnSeekBarChangeListener (new SeekBar.OnSeekBarChangeListener () {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rataX.setText (Integer.toString (progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBarR) {
                oblicz(1,1,Integer.parseInt(seekBarR+""));
            }
        });

        return view;
    }
    double oblicz( int a, int b, int c){
        sumaWynik=a*b+c;
        return sumaWynik;
    }

}
