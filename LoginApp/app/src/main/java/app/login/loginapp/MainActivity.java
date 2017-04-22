package app.login.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView textView;
    private TextView textView2;
    private EditText editText;
    private EditText editText2;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals("admin") &&
                        editText2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "witaj królu",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "zły login",Toast.LENGTH_SHORT).show();

                    }
                }
        });

    }
}
