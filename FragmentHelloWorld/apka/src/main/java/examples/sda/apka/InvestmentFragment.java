package examples.sda.apka;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;


public class InvestmentFragment extends Fragment {

    double odsetka = 1.05;
    int r=1;
    int l=1;
    int w=1;
    TextView sumaWynikX;
    TextView sumaOdsetkiX;
    TextView sumaKapitalX;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_investment, container, false);

        final TextView lataX = (TextView) view.findViewById (R.id.lata_wynik);
        final SeekBar seekBarLata = (SeekBar) view.findViewById ((R.id.seekBar_lata));
        final TextView wplataX = (TextView) view.findViewById (R.id.wplata_wynik);
        final SeekBar seekBarWplata = (SeekBar) view.findViewById ((R.id.seekBar_wplata));
        final TextView rataX = (TextView) view.findViewById (R.id.raty_wynik);
        final SeekBar seekBarRata = (SeekBar) view.findViewById ((R.id.seekBar_raty));
        sumaWynikX = (TextView) view.findViewById (R.id.suma_wynik);
        sumaOdsetkiX = (TextView) view.findViewById (R.id.odsetki_wynik);
        sumaKapitalX = (TextView) view.findViewById (R.id.kapital_wynik);

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
                l = seekBarL.getProgress();
                oblicz();
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
                w = seekBarW.getProgress();
                oblicz();
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
                r = seekBarR.getProgress();
                oblicz();
            }
        });
        return view;
    }
    void oblicz(){
        sumaKapitalX.setText (Double.toString ((r*12*l)+w));
        sumaOdsetkiX.setText (Double.toString ((r*12*l*odsetka)-(r*12*l)));
        sumaWynikX.setText (Double.toString ((r*12*l*odsetka)+w));
    }
}
