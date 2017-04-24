package app.login.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView label1;
    private TextView label2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        label1 = (TextView) findViewById(R.id.textView3);
        label2 = (TextView) findViewById(R.id.textView4);

        if(getIntent().hasExtra("userName")){
            label1.setText(getIntent().getStringExtra("userName"));
        }
        if(getIntent().hasExtra("password")){
            label2.setText(getIntent().getStringExtra("password"));
        }
    }
}
