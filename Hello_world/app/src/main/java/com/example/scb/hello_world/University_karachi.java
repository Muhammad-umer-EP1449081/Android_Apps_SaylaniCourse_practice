package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class University_karachi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("The University of Karachi (Urdu: جامعۂ كراچى\u200E; or KU) is a public research university located in Karachi, Sindh, Pakistan. It is one of the oldest universities in Pakistan being established as a federal university in 1951 under the leadership of Oxford trained Dr. ABA Haleem.[2][3][4][5][6][7][8]\n" +
                "With a student body of 24,000 full-time students and a campus size spanning over 1200 acres, Karachi University is Pakistan's largest university with a distinguished reputation for multi-disciplinary research in science and technology, medical research, and social sciences.[8] The university spans over 53 Departments and 19 world-class research institutes operating under nine faculties.[9] There are over 800 academic's and more than 2500 supporting staff working for the university.[4][10]\n" +
                "In 2009, the university was named by now defunct THE-QS World University Rankings for the top 500 universities in the world, while it is ranked by QS ranking's in 2016 as among to the top 250 in Asia and among 701st in the world, the research at the university is ranked as 'high'.[11][12] The university has been affiliated with world-renowned and notable scholars have been associated and affiliated with the university as faculty, researchers, or alumni since its establishment.[9][9][13]\n" +
                "The university is a member of Association of Commonwealth Universities of the United Kingdom.[14]");
        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.uok);
        imageView.setVisibility(View.VISIBLE);
    }
}
