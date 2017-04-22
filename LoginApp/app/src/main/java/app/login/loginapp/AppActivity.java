package app.login.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AppActivity extends Activity {

    public static final String LOGIN = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        TextView loginTextView = (TextView) findViewById(R.id.loginTextView);
        final String login = getIntent().getStringExtra(LOGIN);
        loginTextView.setText(login);
    }
}
