package layout.baitap.com.phuotthu.Acticity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 2017-11-08.
 */

public class SettingActicity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Intent intent = getIntent();
    }
}
