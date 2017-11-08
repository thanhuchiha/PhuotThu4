package layout.baitap.com.phuotthu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import layout.baitap.com.phuotthu.Acticity.LoginActivity;
import layout.baitap.com.phuotthu.Acticity.SettingActicity;
import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 9/24/2017.
 */

public class FragmentAccount extends Fragment {

    private TextView tv_login, tv_setting;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_acount,container,false);

        tv_login = (TextView) view.findViewById(R.id.tv_login);
        tv_setting = (TextView) view.findViewById(R.id.tv_setting);


        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        tv_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SettingActicity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
