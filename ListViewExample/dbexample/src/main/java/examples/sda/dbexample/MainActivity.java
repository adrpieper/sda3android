package examples.sda.dbexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import examples.sda.dbexample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("Klara","Lewandowska", 0);
        binding.setUser(user);

            binding.nowy.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    User user1 = new User("Ania", "Lewandowska", 30);
                    binding.setUser(user1);

                }
            });
    }
}
