package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;



public class WordAdapter extends ArrayAdapter<Word> {


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

     private int mColorResourceId;


    WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId)
    {

        super(context,0,words);

        mColorResourceId = colorResourceId;

    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.getmDefaultTranslation());


        LinearLayout container = (LinearLayout) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        container.setBackgroundColor(color);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if(currentAndroidFlavor.ImageHasValue())
        {

         imageView.setImageResource(currentAndroidFlavor.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        else
        {
            imageView.setVisibility(View.GONE);
        }



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }



  /*  @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Word wordadapter = getItem(position);

        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        TextView versionNameView = (TextView) convertView.findViewById(R.id.miwok_text_view);
        versionNameView.setText(wordadapter.getmMiwokTranslation());

        TextView versionNumberView = (TextView) convertView.findViewById(R.id.default_text_view);
        versionNumberView.setText(wordadapter.getmDefaultTranslation());

        return ListItemView;

    }*/
}
