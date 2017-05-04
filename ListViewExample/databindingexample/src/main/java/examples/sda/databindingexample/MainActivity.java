package examples.sda.databindingexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import examples.sda.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private User user = new User();
    SimpleText text = new SimpleText();
    private ActivityMainBinding binding;

   /* private TextView name;
    private TextView secName;
    private TextView age;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user.setName("Jan");
        user.setSecName("Kowalski");
        user.setAge(34);

        /*name = (TextView) findViewById(R.id.textView1);
        age = (TextView) findViewById(R.id.textView4);
        secName = (TextView) findViewById(R.id.textView2);*/

      /*  name = binding.textView1;
        secName = binding.textView2;
        age = binding.textView4;*/

        //bindUser(user);

        binding.setUser(user);
        binding.setSomething(text);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setName("Maryjan");
            }
        });
    }



  /*  private void bindUser(User user){
        binding.textView1.setText(user.getName());
        binding.textView2.setText(user.getSecName());
        binding.textView4.setText(String.valueOf(user.getAge()));
    }*/




}
