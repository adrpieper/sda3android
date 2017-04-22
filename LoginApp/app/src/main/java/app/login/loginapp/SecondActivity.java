package app.login.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView result;
    public static final String LOG = "send";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        result = (TextView) findViewById(R.id.textView_pn2);

        if(getIntent().hasExtra(SecondActivity.LOG)){

            result.setText(getIntent().getStringExtra(SecondActivity.LOG));
        }

    }


    public void finish(View v) {
        finish();
    }
}

