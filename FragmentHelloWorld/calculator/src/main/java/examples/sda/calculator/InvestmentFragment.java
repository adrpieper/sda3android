package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Adrian on 2017-04-25.
 */

public class InvestmentFragment extends Fragment {

    private TextView lokataTextView;
    private TextView lataTextView;
    private EditText lataEditText;
    private TextView kwotaTextView;
    private EditText kwotaEditText;
    private TextView procentTextView;
    private EditText procentEditText;
    private TextView zyskTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_investment, container, false);

        lokataTextView = (TextView) view.findViewById(R.id.lokataTextView);
        lataTextView = (TextView) view.findViewById(R.id.lataTextView);
        lataEditText = (EditText) view.findViewById(R.id.lataEditText);
        lataTextView = (TextView) view.findViewById(R.id.lataTextView);
        kwotaTextView = (TextView) view.findViewById(R.id.kwotaTextView);
        kwotaEditText = (EditText) view.findViewById(R.id.kwotaEditText);
        procentTextView = (TextView) view.findViewById(R.id.procentTextView);
        procentEditText = (EditText) view.findViewById(R.id.procentEditText);
        zyskTextView = (TextView) view.findViewById(R.id.zyskTextView);

        view.findViewById(R.id.calculateLokata).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lataTextView.setText(lataEditText.getText());
                kwotaTextView.setText(kwotaEditText.getText());
                procentTextView.setText(procentEditText.getText());
            }
        });


        return view;
    }
}
