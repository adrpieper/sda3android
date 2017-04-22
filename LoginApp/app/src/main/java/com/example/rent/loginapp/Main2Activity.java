package com.example.rent.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    public static final String LOGIN = "login";

    @BindView(R.id.text_view_one)
    protected TextView textViewOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        textViewOne.setText("Witam Cie " + getIntent().getStringExtra(LOGIN));
    }
}
