package app.login.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.editText1);
        input2 = (EditText) findViewById(R.id.editText2);
    }

    public void wykonaj_metode(View v){
        Intent i = new Intent(String.valueOf(getApplicationContext()));
        i.putExtra("Parametr1", input1.getText().toString());
        startActivity(i);

    }
}

