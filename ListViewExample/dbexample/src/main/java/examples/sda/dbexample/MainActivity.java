package examples.sda.dbexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import examples.sda.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView nameTextView;
    private TextView ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        nameTextView = binding.nameTextView;
        ageTextView = binding.ageTextView;

        bindUser(new User("Jan", 20));

    }

    private void bindUser(User user) {
        nameTextView.setText(user.getName());
        ageTextView.setText(String.valueOf(user.getAge()));
    }
}
