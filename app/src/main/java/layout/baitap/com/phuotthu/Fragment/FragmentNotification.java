package layout.baitap.com.phuotthu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 9/24/2017.
 */

public class FragmentNotification extends Fragment {
    ListView lv_notification;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.acticity_notification,container,false);
        arrayList = new ArrayList<>();
        lv_notification = (ListView) view.findViewById(R.id.lv_notification);
        arrayAdapter = new ArrayAdapter(getContext(),R.layout.acticity_notification,arrayList);
        lv_notification.setAdapter(arrayAdapter);
        return view;
    }
}
