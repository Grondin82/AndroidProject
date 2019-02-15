package com.bge.sudoku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class GridAdapter extends BaseAdapter {


    Context context;
    private final String [] values;
    //private final int [] images;
    View view;
    LayoutInflater mLayoutInflater;

    public GridAdapter(Context context, String[] values/*, int[] images*/) {
        this.context = context;
        this.values = values;
        //this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){

            view = new View(context);
            view = mLayoutInflater.inflate(R.layout.single_item, null);
            final TextView textView = (TextView) view.findViewById(R.id.textview);

            //imageview.setImageResource(images[position]);
            textView.setText(values[position]);
        }


        return view;
    }


}
