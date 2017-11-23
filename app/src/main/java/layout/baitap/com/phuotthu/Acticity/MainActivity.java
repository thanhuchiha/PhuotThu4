package layout.baitap.com.phuotthu.Acticity;

import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import layout.baitap.com.phuotthu.Database.Database;
import layout.baitap.com.phuotthu.Database.DiaDiem;
import layout.baitap.com.phuotthu.Database.User;
import layout.baitap.com.phuotthu.Fragment.FragmentAccount;
import layout.baitap.com.phuotthu.Fragment.FragmentHome;
import layout.baitap.com.phuotthu.Fragment.FragmentNotification;
import layout.baitap.com.phuotthu.Fragment.FragmentSaved;
import layout.baitap.com.phuotthu.R;

public class MainActivity extends FragmentActivity {


    List<User> userArr;
    List<DiaDiem> diadiemArr;
    private TextView tv_home, tv_saved, tv_notification, tv_setting_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Database database = new Database(this);
        //database.hello();
        //database.addUser(new User("Admin","12345"));
        //database.addUser(new User("admin","12345"));
       // database.addDiaDiem(new DiaDiem("Asia Park","Asia Park là khu tổ hợp vui chơi giải trí lớn bậc nhất ở Đà Nẵng, với 3 hạng mục chính là công viên vui chơi giải trí, khu Sun Wheel (vòng quay mặt trời) và khu vui chơi trong nhà.","hinh1.jpg"));
        //userArr = database.getAllUser();
        //diadiemArr = database.getAllDiaDiem();


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
