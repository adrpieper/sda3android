package app.login.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Logged extends Activity {

    public static final String LOGIN = "currentLogin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        TextView loginLabel = (TextView) findViewById(R.id.loginLabel);
        if(getIntent().hasExtra(LOGIN)) {
            loginLabel.setText(getIntent().getStringExtra(LOGIN));
        }
    }
}
