package examples.sda.masterdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Main2Activity extends Activity {



    public static final int DETAIL = 1;
    public static final int NOT_DETAIL = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detal_fragment);

        Intent i = getIntent();

        int isDeatil = i.getIntExtra("isDetailInfo", DETAIL);


        if (isDeatil == DETAIL) {
            fragment.showDetailInfo();

        } else {
            fragment.showBasicInfo();
        }
    }
}




