package examples.sda.myfragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by szyms on 4/22/17.
 */

public class ButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final Button button = new Button(getActivity());
        button.setText("OK");

//        button.setOnClickListener();
        
        return button;
    }


}
