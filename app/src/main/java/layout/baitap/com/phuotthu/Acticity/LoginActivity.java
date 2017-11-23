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
import java.util.List;

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
    Database database = new Database(this);
    List<User> userArr;
//    Database database ;//SQLiteDatabase.openDatabase();
//    ArrayList<User> userArr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userArr = database.getAllUser();

        getWidget();

    }


    private void getWidget() {
        tv_register = (TextView) findViewById(R.id.tv_register);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPass = (EditText) findViewById(R.id.edtPass);
//        for(User user: userArr){
//            Toast.makeText(LoginActivity.this,user.getUserName(),Toast.LENGTH_SHORT).show();
//        }
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(User user: userArr){
                    //Toast.makeText(LoginActivity.this,user.getUserName(),Toast.LENGTH_SHORT).show();
                    if(user.getUserName().equals(edtEmail.getText().toString()) && user.getPassWord().equals(edtPass.getText().toString())){
                        Toast.makeText(LoginActivity.this,user.getUserName(),Toast.LENGTH_SHORT).show();
//                       Intent intent = new Intent(LoginActivity.this, FragmentHome.class);
//                       startActivity(intent);
                    }
                }

//
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
