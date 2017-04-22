package app.login.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {


    @BindView(R.id.login)
    protected EditText login;
    @BindView(R.id.pass)
    protected EditText pass;
    @BindView(R.id.button)
    protected Button button;

    private HashMap<String, String> users = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        users.put("admin", "admin");


    }


    @OnClick(R.id.button)
    public void click(View v) {
            String loginString = users.get(login.getText().toString());
            String passString = pass.getText().toString();


        if (!passString.equals(loginString)) {

            Toast.makeText(getApplicationContext(), "Podaj prawidłowy login/hasło", Toast.LENGTH_LONG).show();


        } else if (passString.equals(loginString)) {

            Toast.makeText(this, "Zalogowano użytkownika " + login.getText().toString(), Toast.LENGTH_LONG).show();

//            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
//            startActivity(intent);

        }


    }
}