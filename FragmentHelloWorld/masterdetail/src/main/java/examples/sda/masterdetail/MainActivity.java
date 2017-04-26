package examples.sda.masterdetail;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DetailFragment detail_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detail_fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment2);


    }

    public void showMessageBasic(){

                  // detail_fragment.showBasicData();
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);

    }

    public void showMessageDetail(){
        //detail_fragment.showDetailData();

        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
