package examples.sda.fragmenthelloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity implements ActivityInterface {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button) findViewById(R.id.ActivityOne);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(i,1);
            }
        });
    }

    @Override
    public void showMessage() {
        Toast.makeText(this, "Witaj W drugim Hello World", Toast.LENGTH_SHORT).show();
    }
}
