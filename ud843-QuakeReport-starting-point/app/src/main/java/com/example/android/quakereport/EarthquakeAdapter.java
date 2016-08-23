package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by scb on 8/17/2016.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake>
{

    EarthquakeAdapter(Context context, List<Earthquake> earthquakes)
    {
        super(context,0,earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

     View ListitemView = convertView;

        if(ListitemView == null)
        {
            ListitemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }


        Earthquake currentEarthquake = getItem(position);


        TextView magnitude = (TextView) ListitemView.findViewById(R.id.magnitude);

        magnitude.setText(currentEarthquake.getmMagnitude()+"");


        TextView location = (TextView) ListitemView.findViewById(R.id.location);

        location.setText(currentEarthquake.getMlocation()+"");


        TextView date = (TextView) ListitemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getmDate()+"");


        return ListitemView;

    }
}
