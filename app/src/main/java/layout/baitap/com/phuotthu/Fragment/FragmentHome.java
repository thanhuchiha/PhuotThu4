package layout.baitap.com.phuotthu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import layout.baitap.com.phuotthu.R;
import layout.baitap.com.phuotthu.Acticity.SearchActivity;

/**
 * Created by DELL on 9/24/2017.
 */

public class FragmentHome extends Fragment {

    Button btn_home;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_start,container,false);
        btn_home = (Button) view.findViewById(R.id.btn_search);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),SearchActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
