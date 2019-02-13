package edu.temple.coloractivity;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

Context showContent;
String [] colors;
LayoutInflater inflater;

public ColorAdapter(Context activity, String [] colors){
    this.showContent= activity;
    this.colors = colors;
    inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

}
public int getCount(){
    return colors.length;

}


public Object getItem(int i ){
    return colors[i];
}

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup){
    TextView rows = new TextView(showContent);

    if (view != null) {
        rows = (TextView) view;

    }
    else {
        rows = new TextView(showContent);
    }



    rows.setText(colors[i]);
    rows.setBackgroundColor(Color.parseColor(colors[i]));

    return rows;
}

}
