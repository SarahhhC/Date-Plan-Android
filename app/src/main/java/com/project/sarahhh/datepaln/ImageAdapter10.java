package com.project.sarahhh.datepaln;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter10 extends BaseAdapter{
    private Context mContext;
    private Integer[] mThumbIds = {
            R.drawable.da0,R.drawable.da1,R.drawable.da2,R.drawable.da3,
            R.drawable.da4,R.drawable.da5
    };


    public ImageAdapter10(Context objC) {mContext = objC;}
    public int getCount(){return mThumbIds.length;}
    public Object getItem(int position) { return null;}
    public long getItemId (int position) {return 0;}


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ImageView objImgView;

        if(convertView == null){
            objImgView = new ImageView(mContext);
            objImgView.setLayoutParams(new GridView.LayoutParams(220,200));
            objImgView.setScaleType(ImageView.ScaleType.MATRIX);
            objImgView.setPadding(5, 5, 5, 5);
        } else {
            objImgView = (ImageView) convertView;
        }
        objImgView.setImageResource(mThumbIds[position]);
        objImgView.setScaleType(ImageView.ScaleType.FIT_XY);
        objImgView.setLayoutParams(new Gallery.LayoutParams(800,1200));
        return objImgView;

    }
}
