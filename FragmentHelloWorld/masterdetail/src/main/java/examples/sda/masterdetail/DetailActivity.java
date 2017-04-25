package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends Activity {

    public static final int BASIC = 0;
    public static final int DETAIL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final int data = getIntent().getIntExtra("data", BASIC);
        if (data == BASIC) {
            //showBasic
        }else if (data == DETAIL) {
            //showDetails
        }
    }
}
