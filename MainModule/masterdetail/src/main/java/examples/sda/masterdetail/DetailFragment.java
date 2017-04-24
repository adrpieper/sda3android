package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

/**
 * Created by RENT on 2017-04-24.
 *
 * pole textowe
 */

public class DetailFragment extends Fragment {


    private TextView basicInfo;
    private TextView detailInfo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container,false);

         basicInfo= (TextView) view.findViewById(R.id.textView3_fr_pn);
        detailInfo = (TextView) view.findViewById(R.id.textView2_fr_pn);


        return view;
    }

    public void showBasicData() {

        basicInfo.setText("To jest informacja z Basic data");
    }

    public void showDetailInfo() {
        detailInfo.setText("Informacje szczegolowe ");
    }
}
