package app.login.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
    }

    public void ok_click(View view) {
        Toast.makeText(getApplicationContext(), "Zalogowano", Toast.LENGTH_SHORT).show();

        if(login.getText().toString().equals("admin") && password.getText().toString().equals("admin") ){
            Intent i = new Intent(getApplicationContext(),Main2Activity.class);
            startActivityForResult(i,1);
        }else{
            Intent i = new Intent(getApplicationContext(), Main3Activity.class);
            startActivityForResult(i,1);
        }



    }
}
