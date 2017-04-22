package app.login.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {


    private Logins logs;
    private EditText login;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logs = new Logins();
        login = (EditText) findViewById(R.id.editText_pn);
        password = (EditText) findViewById(R.id.editText2_pn);

    }


    public void sendData(View v) {

        Intent intent  = new Intent(this,SecondActivity.class);
        String login = this.login.getText().toString();
        if(password.getText().toString().equalsIgnoreCase(logs.getLogins().get(login))) {
            Toast.makeText(this,"Your data have beed send",Toast.LENGTH_SHORT).show();
            intent.putExtra("send", login);
            startActivity(intent);

        } else {

            Toast.makeText(this,"Wrong password, try again",Toast.LENGTH_SHORT).show();
        }

    }

    public void quit (View v){
        finish();
    }
}
