package examples.sda.dbexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView nameTextView;
    private TextView ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        ageTextView = (TextView) findViewById(R.id.ageTextView);

        bindUser(new User("Jan", 20));
    }

    private void bindUser(User user) {
        nameTextView.setText(user.getName());
        ageTextView.setText(String.valueOf(user.getAge()));
    }
}
