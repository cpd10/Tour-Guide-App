package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dhook_000 on 1/13/2018.
 */

public class CityAttractionAdapter extends ArrayAdapter<CityAttraction>
{
    public CityAttractionAdapter(Activity context, ArrayList<CityAttraction> attractions)
    {
        super(context,0,attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        CityAttraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentAttraction.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentAttraction.getAddress());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.item_icon);
        iconView.setImageResource(currentAttraction.getImageID());



        return listItemView;
    }
}
