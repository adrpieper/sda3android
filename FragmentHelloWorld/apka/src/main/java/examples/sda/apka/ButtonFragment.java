package examples.sda.apka;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_button, container, false);
        final Button investmentButton = (Button) view.findViewById(R.id.button1);
        final Button curenncyButton = (Button) view.findViewById(R.id.button2);


        final MainActivity mainActivity = (MainActivity) getActivity();
        investmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showInvestment();
                Animation animation = AnimationUtils.loadAnimation (getActivity (),R.anim.animacja);
                investmentButton.startAnimation(animation);
            }
        });
        curenncyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showCurrencyCalculator();
                Animation animation = AnimationUtils.loadAnimation (getActivity (),R.anim.animacja);
                curenncyButton.startAnimation(animation);
            }
        });

        return view;
    }
}


