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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final User person = new User("Adam", 29);
        final User person2 = new User("Kowalski",20);
        binding.setUser(person);
        binding.setName("Imie:");
        binding.setAge("Age:");

        binding.nextPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.setUser(person2);
            }
        });

        binding.prevPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.setUser(person);
            }
        });
     }

}
