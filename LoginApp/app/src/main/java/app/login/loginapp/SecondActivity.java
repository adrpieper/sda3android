package app.login.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView3;
    public static final String LOGIN = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView3 = (TextView) findViewById(R.id.textView3);

        final String login = getIntent().getStringExtra(LOGIN);
        textView3.setText(login);
    }
}
