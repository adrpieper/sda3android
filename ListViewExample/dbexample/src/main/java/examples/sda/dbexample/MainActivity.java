package examples.sda.dbexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import examples.sda.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {


    private ActivityMainBinding binding;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main );

        user = new User("Jan", 30);

        binding.setUser(user);



        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = new User("Marcin", 20);
                binding.setUser(user);
            }
        });



    }









}
