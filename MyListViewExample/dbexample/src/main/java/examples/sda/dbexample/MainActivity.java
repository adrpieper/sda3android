package examples.sda.dbexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import examples.sda.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(new User("Jan", 28));
        // no longer necessary!
        //setContentView(R.layout.activity_main);

/*        nameTextView = (TextView) findViewById(R.id.name_text_view);
        ageTextView = (TextView) findViewById(R.id.age_text_view);*/

/*      another way of writing that:
        nameTextView = binding.nameTextView;
        ageTextView = binding.ageTextView;*/

/*        User user = new User("Jan", 28);
        User user2 = new User("Kasia", 24);*/

//        bindUser(new User("Jan", 28));


    }

/*    private void bindUser(User user) {

        binding.nameTextView.setText(user.getName());
        binding.ageTextView.setText(String.valueOf(user.getAge()));
    }*/
}
