package layout.baitap.com.phuotthu.Acticity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import layout.baitap.com.phuotthu.Database.Database;
import layout.baitap.com.phuotthu.Database.User;
import layout.baitap.com.phuotthu.Fragment.FragmentHome;
import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 2017-10-25.
 */

public class LoginActivity extends AppCompatActivity {

    TextView tv_register;
    Button btnDangNhap;
    EditText edtEmail,edtPass;
//    Database database ;//SQLiteDatabase.openDatabase();
//    ArrayList<User> userArr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        userArr = new ArrayList<>();
//        selectDatabaseUser();
        getWidget();

    }
//    private void selectDatabaseUser() {
//        // select data
//        Cursor dataUser = database.GetData("SELECT * FROM user");
//        while (dataUser.moveToNext()) {
//            int id = dataUser.getInt(0);
//            String username = dataUser.getString(1);
//            String password = dataUser.getString(2);
//            Toast.makeText(this, username, Toast.LENGTH_SHORT).show();
//            userArr.add(new User(id, username, password));
//        }
//
//    }

    private void getWidget() {
        tv_register = (TextView) findViewById(R.id.tv_register);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPass = (EditText) findViewById(R.id.edtPass);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(LoginActivity.this, FragmentHome.class);
//                startActivity(intent);
            }
        });

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
