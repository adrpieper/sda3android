package examples.sda.dbexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import examples.sda.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindUser(new User("Jan", 20));

    }

    private void bindUser(User user) {
        binding.nameTextView.setText(user.getName());
        binding.ageTextView.setText(String.valueOf(user.getAge()));
    }
}
