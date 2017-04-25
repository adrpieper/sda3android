package examples.sda.masterdetail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static examples.sda.masterdetail.AdditionalActivity.DETAIL;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // showBasicInfo();

    }


    public void showBasicInfo() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        if(fragment != null && fragment.isInLayout()){
            fragment.showBasicInfo();
        }else{
            startAdditionalActivity(AdditionalActivity.BASIC);
        }
    }

    public void showDetails() {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        if(fragment != null && fragment.isInLayout()){
            fragment.showDetails();
        }else{
            startAdditionalActivity(DETAIL);
        }
    }

    public void startAdditionalActivity(int p){
        Intent i = new Intent(getApplicationContext(), AdditionalActivity.class);
        i.putExtra("message", AdditionalActivity.DETAIL);
        startActivity(i);
    }
}
