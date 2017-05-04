package examples.sda.dbexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import examples.sda.dbexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user = new User("Jan", 28);
        binding.setUser(user);

        binding.nextUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // to nie ma sensu
                //binding.nameTextView.setText(binding.getUser().getName() + " Gołowąs");

                // najprościej tak zmienić treść TextView:
                //binding.setUser(new User("Paeł", 20));

                user.setName("Adam");
                binding.invalidateAll();
            }
        });
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
