package examples.sda.daggerexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import examples.sda.daggerexample.model.State;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView goldTextView = (TextView) findViewById(R.id.goldTextView);
        Button balanceButton = (Button) findViewById(R.id.balanceButton):

        State state = StateProvider.provide();

        goldTextView.setText("gold : " + state.getGold());

    }
}
