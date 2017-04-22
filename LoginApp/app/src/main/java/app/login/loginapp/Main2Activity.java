package app.login.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {

    public static final String LOGIN = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView loginTextView = (TextView) findViewById(R.id.textView);
        final String login = getIntent().getStringExtra(LOGIN);
        loginTextView.setText(login);
    }
}
