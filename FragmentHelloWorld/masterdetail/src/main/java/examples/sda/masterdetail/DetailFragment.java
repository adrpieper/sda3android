package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Adrian on 2017-04-22.
 */

public class DetailFragment extends Fragment {
private TextView title;
    private TextView content;


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,Bundle savedInstancesState){
        final View view = inflater.inflate(R.layout.fragment_detail,container,false);
        title = (TextView) view.findViewById(R.id.title);
        content = (TextView) view.findViewById(R.id.content);
        return view;

    }

    public void showBasicData() {
        title.setText("Pole ogólne");
        content.setText("Ogół");
    }

    public void showDetailData() {
        title.setText("szczegóły");
        content.setText("szczegóły");
    }
}

