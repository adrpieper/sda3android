package examples.sda.masterdetail;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    public static final int DETAIL = 0;
    public static final int BASIC = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
