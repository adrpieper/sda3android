package app.login.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {

    private EditText login;
    private EditText password;
    private Button button;
    private Map<String, String> users = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createUsers();
        login = (EditText) findViewById(R.id.editTextLogin);
        password = (EditText) findViewById(R.id.editTextPwd);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loginCheck(login.getText().toString(), password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "zalogowano", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Logged.class);
                    i.putExtra(Logged.LOGIN, login.getText().toString());
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "bledne dane", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean loginCheck(String login, String pwd) {
        for (Map.Entry<String, String> entry : users.entrySet()) {
            if (entry.getKey().equals(login)) {
                if (entry.getValue().equals(pwd)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void createUsers() {
        users.put("admin", "admin");
        users.put("admin1", "admin1");
        users.put("admin2", "admin2");
    }

}
