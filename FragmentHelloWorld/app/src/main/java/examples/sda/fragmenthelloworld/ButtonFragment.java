package examples.sda.fragmenthelloworld;

import android.animation.Animator;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by RENT on 2017-04-22.
 */

public class ButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.single_button_layout, container,false);

        Button button = (Button) v.findViewById(R.id.button) ;
        //button.setText("OK");

        final ActivityInterface mainActivity = (ActivityInterface) getActivity();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showMessage();
            }
        });

        return v;
    }
}
