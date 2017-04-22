package app.login.loginapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private UserService service = new UserService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nameTextField = (EditText) findViewById(R.id.nameTextField);
        final EditText passwordTextField = (EditText) findViewById(R.id.passwordTextField);
        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String userName = nameTextField.getText().toString();
                final String password = passwordTextField.getText().toString();

                if (service.checkUser(userName, password)) {
                    Toast.makeText(MainActivity.this, "Witaj " + userName, Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, AppActivity.class);
                    intent.putExtra(AppActivity.LOGIN, userName);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Zły login lub hasło", Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}
