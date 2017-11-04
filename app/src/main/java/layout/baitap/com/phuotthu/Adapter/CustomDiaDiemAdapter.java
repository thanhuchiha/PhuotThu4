package layout.baitap.com.phuotthu.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by DELL on 9/21/2017.
 */

public class CustomDiaDiemAdapter extends FragmentPagerAdapter {

    private static int c=2;
    ArrayList<Fragment> fragments = new ArrayList<>();

    public CustomDiaDiemAdapter(FragmentManager fm) {
        super(fm);
    }


    public void addFragmentintoAdapter(Fragment fragment){
        fragments.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return c;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){
            case 0:
                title = "Xem gần đây.";
                break;
            case 1:
                title = "Đặt gần đây.";
                break;
        }
        return title;
    }
}
