package com.app21efullpyramidfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {

    private final String name[];
    private final int img[];
    Context context;

    public MyListAdapter( Context context, String[] name, int[] img) {
        this.context = context;
        this.name = name;
        this.img = img;
    }
    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1=layoutInflater.inflate(R.layout.mylistlayout,null);

        ImageView img1 =view1.findViewById(R.id.img_flag);
        TextView name1 = view1.findViewById(R.id.tv_flag);

        img1.setImageResource(img[i]);
        name1.setText(name[i]);

        return view1;
    }
}
