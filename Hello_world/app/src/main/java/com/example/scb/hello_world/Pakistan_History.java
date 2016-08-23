package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Pakistan_History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("The history of Pakistan (Urdu: تاريخ پاكِستان \u200E) encompasses the history of the region constituting modern Pakistan. Prior to independence in 1947, the territory of modern Pakistan was a part of the British Indian Empire. Prior to that it was ruled in different periods by local kings and numerous imperial powers. The ancient history of the region comprising present-day Pakistan also includes some of the oldest of the names of empires of South Asia[1] and some of its major civilizations.[2][3][4][5]\n" +
                "In the 19th century, the land was incorporated into British India. Pakistan's political history began with the birth of the All India Muslim League in 1906 to protect \"Muslim interests, amid neglect and under-representation\" and to oppose Congress; in return the British Raj would decide to grant local self-rule. On 29 December 1930, philosopher Sir Muhammad Iqbal called for an autonomous new state in \"northwestern India for Indian Muslims\".[6] The League rose to popularity in the late 1930s. Muhammad Ali Jinnah espoused the Two Nation Theory and led the League to adopt the Lahore Resolution[7] of 1940, demanding the formation of independent states in the East and the West of British India. Eventually, a successful movement led by Jinnah resulted in the partition of India and independence from Britain, on 14 August 1947.");


        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.download);
        imageView.setVisibility(View.VISIBLE);

    }


}
