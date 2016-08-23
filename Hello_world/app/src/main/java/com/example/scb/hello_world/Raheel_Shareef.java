package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Raheel_Shareef extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("General Raheel Sharif was born in Quetta, Balochistan Province. He belongs to a Rajput family[3][6][7] with roots in Punjab (in the town of Kunjah, Gujrat).[3] He has a prominent military background,[4] and is the son of (late) Major Rana Muhammad Sharif.[4] His eldest brother Major Rana Shabbir Sharif, was declared as the martyr of Indo-Pakistani War of 1971 by Pakistan and received Pakistan's highest military award Nishan-e-Haider posthumously. He is the youngest sibling among three brothers and two sisters.[8] His other brother, Captain Mumtaz Sharif, also bravely served in Pakistan army and for his bravery he was awarded Sitara-e- Basalat, but got an early retirement due to medical reasons.[3] From his mother's side, he is nephew of Major Raja Aziz Bhatti, another Nishan-e-Haider recipient, who was declared as the martyr of Indo-Pakistani War of 1965 by Pakistan.[9] He is married and has three children, two sons and a daughter.[4] He is an avid reader and enjoys hunting and swimming.[10]");

        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.raheel1);
        imageView.setVisibility(View.VISIBLE);
    }
}
