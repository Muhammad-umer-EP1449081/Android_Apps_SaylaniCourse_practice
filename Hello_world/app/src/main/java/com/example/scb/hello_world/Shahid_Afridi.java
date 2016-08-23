package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Shahid_Afridi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("Shahid Khan Afridi (Urdu: شاہدآفریدی\u200E; Pashto: شاهد اپریدی\u200E; born 1980)[4] is a Pakistani professional cricketer and former captain of the Pakistan national cricket team.[5] Afridi is considered a legend in Pakistan's cricket history and widely regarded as one of the greatest big-hitters of all time. He also holds a record of taking most wickets (97) and most player-of-the match awards in Twenty20 International cricket.[6]\n" +
                "He is known for his aggressive batting style,[7] and previously held the record for the fastest ODI century in 37 deliveries. He also holds the distinction of having hit the most number of sixes in the history of ODI cricket,.[8] Afridi considers himself a better bowler than batsman, and has taken 48 Test wickets and over 350 in ODIs. Currently Afridi is leading the chart of most T20I wickets with 92 wickets from 92 matches.[9] Afridi currently captains the PSL team [Peshawar Zalmi]] which is owned by his cousin Javed Afridi.[10]\n" +
                "Afridi is a philanthropist and owner of the Shahid Afridi Foundation. In 2015, Afridi was named among the top 20 most charitable athletes in the world by Do Something. [11]");

        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.afridi);
        imageView.setVisibility(View.VISIBLE);
    }
}
