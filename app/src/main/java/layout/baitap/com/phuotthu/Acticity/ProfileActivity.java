package layout.baitap.com.phuotthu.Acticity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 2017-10-15.
 */

public class ProfileActivity extends AppCompatActivity {

    private TextView tv_camera;
    private TextView tv_cmt;
    private TextView tv_save;
    private TextView tv_share;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
