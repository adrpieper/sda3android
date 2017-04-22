package app.login.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private Button return_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        return_button = (Button) findViewById(R.id.return_button);
        return_button.setOnClickListener(new OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent i = new Intent (getApplicationContext(),MainActivity.class);
                                                 startActivityForResult(i,1);
                                             }
                                         }
        );
    }


}
