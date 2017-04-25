package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class DetailedActivity extends Activity {

    public final static int BASIC = 0;
    public final static int DETAILED = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       final int data = getIntent().getIntExtra("Data", BASIC);
               if (data ==BASIC){

                   DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment);
                   fragment.showBasicData();

       }else if(data ==DETAILED){
                   DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment);
                   fragment.showDetailData();
               }


    }
}
