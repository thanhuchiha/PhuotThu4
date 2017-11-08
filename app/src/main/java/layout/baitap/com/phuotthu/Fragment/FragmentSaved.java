package layout.baitap.com.phuotthu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import layout.baitap.com.phuotthu.Object.Place;
import layout.baitap.com.phuotthu.Adapter.ListViewProfileAdapter;
import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 9/24/2017.
 */

public class FragmentSaved extends Fragment {
    ListView lv_saved;
    ArrayList<Place> arrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListView lv_xemganday;
        arrayList = new ArrayList<>();

        View view = inflater.inflate(R.layout.activity_saved,container,false);
        lv_saved = (ListView) view.findViewById(R.id.lv_saved);
        arrayList.add(new Place(R.drawable.dailanh,"Hải Đăng Đại Lãnh","Khánh Hòa"));
        arrayList.add(new Place(R.drawable.dailanh,"abc","xyz"));
        arrayList.add(new Place(R.drawable.dailanh,"def","ghk"));
        ListViewProfileAdapter listViewProfileAdapter = new ListViewProfileAdapter(getContext(),R.layout.diadiem_layout,arrayList);

        lv_saved.setAdapter(listViewProfileAdapter);

        lv_saved.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }
}
