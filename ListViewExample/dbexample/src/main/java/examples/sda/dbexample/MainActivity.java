package examples.sda.dbexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import examples.sda.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final User user = new User("Anna", 35);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(new User("Jan Kowalski", 20));
        binding.setUser(user);

        //nie mamy obserwatora

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //binding.setUser(new User("Tomasz Nowicki", 50));
                user.setName("Ola");
                user.setAge(new Random().nextInt(30) + 20);
            }
        });
        //bindUser(new User("Jan", 20));
    }

    /*public void bindUser(User user) {

        binding.nameEditText.setText(user.getName());
        binding.ageEditText.setText(String.valueOf(user.getAge()));

    }*/
}