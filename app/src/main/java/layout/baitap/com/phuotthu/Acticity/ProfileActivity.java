package layout.baitap.com.phuotthu.Acticity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 2017-10-15.
 */

public class ProfileActivity extends AppCompatActivity {

    private TextView tv_camera;
    private TextView tv_cmt;
    private TextView tv_save;
    private TextView tv_share;
    private ImageView img_profile;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWidget();

    }

    private void getWidget() {

        tv_camera =(TextView) findViewById(R.id.tv_camera);
        tv_cmt =(TextView) findViewById(R.id.tv_cmt);
        tv_save =(TextView) findViewById(R.id.tv_save);
        tv_share =(TextView) findViewById(R.id.tv_share);
        img_profile = (ImageView) findViewById(R.id.img_profile);

        String URL = "https://www.google.com.vn/search?q=hai+dang+dai+lanh&rlz=1C1CHZL_viVN765VN765&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjnl-6i-6vXAhWMO48KHfaPCr8Q_AUICigB&biw=1366&bih=662#imgrc=8LutMISTAOLY-M:";

        Picasso.with(this).load(URL).into(img_profile);
    }
}
