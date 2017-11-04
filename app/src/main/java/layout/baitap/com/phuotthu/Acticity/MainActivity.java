package layout.baitap.com.phuotthu.Acticity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import layout.baitap.com.phuotthu.Fragment.FragmentAccount;
import layout.baitap.com.phuotthu.Fragment.FragmentHome;
import layout.baitap.com.phuotthu.Fragment.FragmentNotification;
import layout.baitap.com.phuotthu.Fragment.FragmentSaved;
import layout.baitap.com.phuotthu.R;

public class MainActivity extends FragmentActivity {

    private TextView tv_home, tv_saved, tv_notification, tv_setting_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init() {
        tv_home = (TextView) findViewById(R.id.tv_home);
        tv_saved = (TextView) findViewById(R.id.tv_saved);
        tv_notification = (TextView) findViewById(R.id.tv_notification);
        tv_setting_account =(TextView) findViewById(R.id.tv_account);


        tv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentHome());
            }
        });
        tv_saved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentSaved());
            }
        });
        tv_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentNotification());
            }
        });
        tv_setting_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(new FragmentAccount());
            }
        });
    }

    public void addFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();
    }


}
