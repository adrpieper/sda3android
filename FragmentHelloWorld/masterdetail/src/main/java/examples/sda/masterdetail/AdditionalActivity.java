package examples.sda.masterdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AdditionalActivity extends AppCompatActivity {


    private DetailFragment detailFragment;
    final public static int DETAIL = 1;
    final public static int BASIC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional);

        detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);


        final int data = getIntent().getIntExtra("message", -1);
        if(data==DETAIL){
            detailFragment.showDetails();
        }else if(data==BASIC){
            detailFragment.showBasicInfo();
        }else{
            Toast.makeText(this, "There is no such data", Toast.LENGTH_SHORT).show();
        }
    }


}
