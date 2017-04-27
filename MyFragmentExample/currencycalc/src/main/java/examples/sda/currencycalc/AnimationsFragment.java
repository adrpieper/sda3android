package examples.sda.currencycalc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by szyms on 4/27/17.
 */

public class AnimationsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        final View v = inflater.inflate(R.layout.fragment_animations, container, false);
        final View button = v.findViewById(R.id.animate_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation a = AnimationUtils.loadAnimation(getActivity(), R.anim.example_animation);
                button.startAnimation(a);
            }
        });


        return v;
    }
}
