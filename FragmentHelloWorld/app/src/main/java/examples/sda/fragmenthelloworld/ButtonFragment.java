package examples.sda.fragmenthelloworld;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
<<<<<<< HEAD
 * Created by RENT on 2017-04-22.
 */

public class ButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final Button button = new Button(getActivity());
        button.setText("OK");
        return button;
    }
}
