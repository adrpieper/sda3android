package app.login.loginapp;

import android.app.Activity;
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
        EditText passwordTextField = (EditText) findViewById(R.id.passwordTextField);
        Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Witaj " + nameTextField.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
