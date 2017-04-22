package com.example.rent.loginapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edit_text_one)
    protected EditText editTextOne;

    @BindView(R.id.edit_text_two)
    protected EditText editTextTwo;

    @BindView(R.id.button_one)
    protected Button buttonOne;

//    private Map<String, String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_one)
    public void buttonClick(View v) {

//        map.put("admin", "admin");

        String login = "admin";
        String haslo = "admin";


        if (editTextOne.getText().toString().equals(login) && editTextTwo.getText().toString().equals(haslo)) {

            Context context = getApplicationContext();
            CharSequence text = "User logged in.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            intent.putExtra("login", editTextOne.getText().toString());
            startActivity(intent);

        } else {
            Context context = getApplicationContext();
            CharSequence text = "Invalid login information.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }


    }
}
