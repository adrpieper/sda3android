package com.example.adrian.world.hello.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {


    private TextView myDisply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDisply = (TextView) findViewById(R.id.textView_pn);
        myDisply.setText("Przemyslaw Nowacki");
    }
}
