package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by RENT on 2017-04-25.
 */

public class InvestmentFragment extends Fragment {

    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_investment,container,false);
        text = (TextView) view.findViewById(R.id.textView2_pn);

        text.setText("test działania");



        return view;
    }



}
