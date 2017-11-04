package layout.baitap.com.phuotthu.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 9/19/2017.
 */

public class ListViewProfileAdapter extends ArrayAdapter<DiaDiem> {

    private Context contex;
    private int layout;
    private ArrayList<DiaDiem> arrayList;

    public ListViewProfileAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<DiaDiem> objects) {
        super(context, resource, objects);
        this.contex=context;
        this.layout = resource;
        this.arrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(contex).inflate(R.layout.diadiem_layout,parent,false);
        TextView tv_name_diadiem = (TextView) convertView.findViewById(R.id.tv_name_diadiem);
        TextView tv_address_diadiem = (TextView) convertView.findViewById(R.id.tv_address_diadiem);
        ImageView img_diadiem = (ImageView) convertView.findViewById(R.id.img_diadiem);

        DiaDiem diadiem = arrayList.get(position);
        tv_name_diadiem.setText(diadiem.getName());
        tv_address_diadiem.setText(diadiem.getAddress());
        img_diadiem.setImageResource(diadiem.getImage());

        return  convertView;
    }

    private class ViewHolder{
        private TextView tv_name_diadiem, tv_address_diadiem;
        private ImageView img_diadiem;
    }

    //    private Context context;
//    private int layut;
//    ArrayList<DiaDiem> arrayList;
//
//    public ListViewProfileAdapter(Context context, int layut, ArrayList<DiaDiem> arrayList) {
//        this.context = context;
//        this.layut = layut;
//        this.arrayList = arrayList;
//    }
//
//    @Override
//    public int getCount() {
//        return arrayList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return 0;
//    }
//
//    private class ViewHolder{
//        private ImageView image;
//        private TextView tv_name, tv_address;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        ViewHolder viewHolder;
//        if(view==null){
//            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
//            view = layoutInflater.inflate(R.layout.diadiem_layout,viewGroup,false);
//
//            viewHolder = new ViewHolder();
//            viewHolder.image = (ImageView) view.findViewById(R.id.image_avt);
//            viewHolder.tv_name = (TextView)view.findViewById(R.id.tv_name_diadiem);
//            viewHolder.tv_address = (TextView) view.findViewById(R.id.tv_address_diadiem);
//
//            view.setTag(viewHolder);
//        }else{
//            viewHolder = (ViewHolder) view.getTag();
//        }
//
//        DiaDiem diaDiem = arrayList.get(i);
//        viewHolder.tv_address.setText(diaDiem.getName());
//        viewHolder.tv_address.setText(diaDiem.getAddress());
//        viewHolder.image.setImageResource(diaDiem.getImage());
//        return view;
//    }
//
//    public void addDiaDiem(DiaDiem diaDiem){
//        arrayList.add(diaDiem);
//    }

}
