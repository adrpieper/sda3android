package examples.sda.daggerexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import examples.sda.daggerexample.model.State;
import examples.sda.daggerexample.model.StateProvider;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView goldTextView = (TextView) findViewById(R.id.gold_text_view);
        Button balanceButton = (Button) findViewById(R.id.balance_button);

        State state = StateProvider.provide();

        goldTextView.setText(state.getGold());
    }
}
