package examples.sda.masterdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment);
       showBasicData();
    }
    public void showBasicData() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment);
            if(fragment !=null && fragment.isInLayout()) {

                fragment.showBasicData();

            }
            else{
                Intent intent = new Intent (this, DetailedActivity.class);
                intent.putExtra("Data", DetailedActivity.BASIC);
                startActivity(intent);


            }
    }
    public void showDetailData() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment);
        if(fragment !=null && fragment.isInLayout()) {
            fragment.showDetailData();
        }
        else{
            Intent intent = new Intent (this, DetailedActivity.class);
            intent.putExtra("Data", DetailedActivity.DETAILED);

            startActivity(intent);


        }
    }


}

