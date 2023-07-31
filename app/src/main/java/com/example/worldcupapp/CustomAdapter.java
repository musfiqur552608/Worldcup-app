package com.example.worldcupapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryModelClass> {

    private ArrayList<CountryModelClass> countryArraylist;
    Context context;

    public CustomAdapter(ArrayList<CountryModelClass> data, Context context) {
        super(context,R.layout.item_list_layout, data);
        this.countryArraylist = data;
        this.context = context;
    }

    private static class ViewHolder{

        TextView country;
        TextView cupWin;
        ImageView flagImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CountryModelClass dataModel = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout,parent, false);

            viewHolder.country = convertView.findViewById(R.id.country_name);
            viewHolder.cupWin = convertView.findViewById(R.id.cupswin);
            viewHolder.flagImg = convertView.findViewById(R.id.imageView);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.country.setText(dataModel.getCountry_name());
        viewHolder.cupWin.setText(dataModel.getCup_win_count());
        viewHolder.flagImg.setImageResource(dataModel.getFlag_img());

        return convertView;

    }
}
