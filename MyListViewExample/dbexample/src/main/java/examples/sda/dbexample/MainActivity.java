package examples.sda.dbexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView nameTextView, ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = (TextView) findViewById(R.id.name_text_view);
        ageTextView = (TextView) findViewById(R.id.age_text_view);

/*        User user = new User("Jan", 28);
        User user2 = new User("Kasia", 24);*/

        bindUser(new User("Jan", 28));
    }

    private void bindUser(User user) {

        nameTextView.setText(user.getName());
        ageTextView.setText(String.valueOf(user.getAge()));
    }
}
