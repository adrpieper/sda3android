package com.example.rent.fragmenthelloworld;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by RENT on 2017-04-22.
 */

public class ButtonFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final Button button = new Button(getActivity());
        button.setText("OK");


        final MainActivity mainActivity = (MainActivity) getActivity();


        return button;
    }
}
