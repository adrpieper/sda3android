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
        final User user = new User("Jan", 20);
        binding.setUser(user);
        binding.nextUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setName("Adam");
                binding.invalidateAll();
            }
        });
    }
}
