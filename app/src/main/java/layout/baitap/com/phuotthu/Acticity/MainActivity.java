package layout.baitap.com.phuotthu.Acticity;

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

import layout.baitap.com.phuotthu.Database.Database;
import layout.baitap.com.phuotthu.Database.DiaDiem;
import layout.baitap.com.phuotthu.Database.User;
import layout.baitap.com.phuotthu.Fragment.FragmentAccount;
import layout.baitap.com.phuotthu.Fragment.FragmentHome;
import layout.baitap.com.phuotthu.Fragment.FragmentNotification;
import layout.baitap.com.phuotthu.Fragment.FragmentSaved;
import layout.baitap.com.phuotthu.R;

public class MainActivity extends FragmentActivity {

    Database database;
    ArrayList<User> userArr;
    ArrayList<DiaDiem> diadiemArr;
    private TextView tv_home, tv_saved, tv_notification, tv_setting_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userArr = new ArrayList<>();
        diadiemArr = new ArrayList<>();
        createDatabase();
        insertDatabase();
        selectDatabaseUser();
        selectDatabaseDiaDiem();
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
    private void createDatabase(){

        //tạo database
        database = new Database(this, "night_fury.sql",null,1);
        //tạo bảng user
        database.QueryData("CREATE TABLE IF NOT EXISTS user(Id INTEGER PRIMARY KEY AUTOINCREMENT, UserName VARCHAR(100), PassWord VARCHAR(100))");
        //tạo bảng địa điểm
        database.QueryData("CREATE TABLE IF NOT EXISTS diadiem(Id INTEGER PRIMARY KEY AUTOINCREMENT, dia_diem VARCHAR(100),chitiet VARCHAR(10000),hinhanh VARCHAR(100))");
        // tạo bảng comment
        database.QueryData("CREATE TABLE IF NOT EXISTS comment(Id INTEGER PRIMARY KEY AUTOINCREMENT,noidung VARCHAR(10000), id_user INTEGER, id_diadiem INTEGER)");

    }
    private void insertDatabase(){
       // database.QueryData("INSERT INTO user VALUES(null, 'Admin','12345')");
        //database.QueryData("INSERT INTO diadiem VALUES(null, 'Asia Park','Asia Park là khu tổ hợp vui chơi giải trí lớn bậc nhất ở Đà Nẵng, với 3 hạng mục chính là công viên vui chơi giải trí, khu Sun Wheel (vòng quay mặt trời) và khu vui chơi trong nhà.','hinh1.jpg')");
       // database.QueryData("INSERT INTO diadiem VALUES(null,'Fantasy Park','Fantasy Park là khu vui chơi giải trí trên Bà Nà Hill. Bước vào Fantasy Park, bạn sẽ thấy giống như mình đang lạc vào thế giới thần tiên trong truyện cổ tích, với những khu rừng Thần Tiên, công viên khủng long… hay thử thách lòng dũng cảm của mình bằng cách chinh phục những trò chơi như Tháp Tự Do và hơn 90 trò chơi miễn phí khác.','hinh2.jpg')");
        //database.QueryData("INSERT INTO diadiem VALUES(null, 'Bãi biển Mỹ Khê','Bãi biển Mỹ Khê là 1 trong số những bãi biển đẹp nhất ở Đà Nẵng, và sẽ thật là quá tiếc nuối nếu như bạn đến Đà Nẵng mà không được tắm biển cũng như vui chơi ở bãi biển Mỹ Khê 1 lần.','hinh3.jpg')");
    }
    private void selectDatabaseUser() {
        // select data
        Cursor dataUser = database.GetData("SELECT * FROM user");
        while (dataUser.moveToNext()) {
            int id = dataUser.getInt(0);
            String username = dataUser.getString(1);
            String password = dataUser.getString(2);
            Toast.makeText(this, username, Toast.LENGTH_SHORT).show();
            userArr.add(new User(id, username, password));
        }

    }
    private void selectDatabaseDiaDiem(){
        // select data
        Cursor dataDiaDiem = database.GetData("SELECT * FROM diadiem");
        while (dataDiaDiem.moveToNext()) {
            int id = dataDiaDiem.getInt(0);
            String diadiem = dataDiaDiem.getString(1);
            String chitiet = dataDiaDiem.getString(2);
            String hinhanh = dataDiaDiem.getString(3);
            Toast.makeText(this, diadiem, Toast.LENGTH_SHORT).show();
           diadiemArr.add(new DiaDiem(id,diadiem, chitiet, hinhanh));
        }
    }
}
