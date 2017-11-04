package layout.baitap.com.phuotthu.Acticity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import layout.baitap.com.phuotthu.Adapter.CustomDiaDiemAdapter;
import layout.baitap.com.phuotthu.Fragment.FragmentDatGanDayActivity;
import layout.baitap.com.phuotthu.Fragment.FragmentXemGanDayActivity;
import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 9/19/2017.
 */

public class SearchActivity  extends AppCompatActivity{

    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mapped();
        createTabViewPager();
        Intent intent = getIntent();


    }


    private void mapped(){
        viewPager = (ViewPager) findViewById(R.id.viewPage);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
    }
    private void createTabViewPager(){
        CustomDiaDiemAdapter xenGanDayAdapter = new CustomDiaDiemAdapter(getSupportFragmentManager());
        xenGanDayAdapter.addFragmentintoAdapter(new FragmentDatGanDayActivity());
        xenGanDayAdapter.addFragmentintoAdapter(new FragmentXemGanDayActivity());
        viewPager.setAdapter(xenGanDayAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
