package app.login.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @BindView(R.id.text_one)
    protected TextView text_one;
    @BindView(R.id.login)
    protected EditText login;
    @BindView(R.id.text_two)
    protected TextView text_two;
    @BindView(R.id.password)
    protected EditText password;
    @BindView(R.id.button)
    protected Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick (R.id.button)
    public void send (View v){
        Toast.makeText(this, "You logged in!", Toast.LENGTH_LONG).show();

    }
}
