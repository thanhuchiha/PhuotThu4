package layout.baitap.com.phuotthu.Acticity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 2017-10-25.
 */

public class LoginActivity extends AppCompatActivity {

    TextView tv_register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWidget();
    }

    private void getWidget() {
        tv_register = (TextView) findViewById(R.id.tv_register);

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
