package examples.sda.daggerexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.Component;
import examples.sda.daggerexample.model.State;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView goldTextView = (TextView) findViewById(R.id.goldTextView);
        Button balanceButton = (Button) findViewById(R.id.balanceButton);

        StateComponent stateComponent = DaggerStateComponent.create();
        final State state = stateComponent.state();

        goldTextView.setText("gold : "+state.getGold());

        balanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state.countBalance();
                goldTextView.setText("gold : "+state.getGold());
            }
        });

    }
}
