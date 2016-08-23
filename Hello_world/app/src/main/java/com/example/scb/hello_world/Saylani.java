package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Saylani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("Saylani Welfare International Trust is a Pakistani charity focusing primarily on feeding the homeless. It was established in May 1999 and is headquartered at Bahdurabad, Karachi, Pakistan.\n" +
                "It was founded and headed by famous spiritual and religious scholar Maulana Bashir Farooq Qadri.[1][2] With an estimated monthly expenditure of Pakistani Rupees above 30 million, Saylani Trust, provides food twice a day to more than 30,000 poor people through its 100 centers (generally known as Dastar-Khawan), most of them are serving in Karachi.[3][4] Distribution of CNG rickshaws among the jobless citizens of Karachi in April, 2011 with the help of prominent business community of Karachi was the turning point in its popularity.[5]\n" +
                "Atomic Scientist of Pakistan, Dr. A.Q. Khan has commented in his published article that Saylani Welfare Org. is striving it’s hard to facilitate the people of Pakistan in every field of social wellbeing for the betterment of citizen of Pakistan and appreciated the job rendered by Maulana Bashir Farooq Qadri and his enthusiastic associates working for humanitarian cause. He was invited to grace the occasion as Guest of honor to a seminar organized by the Saylani trust on the subject of Development of Agriculture in Pakistan, attended by prominent experts in Agriculture and Bio-technology.[6] Tools of check and balance with financial accountability are maintained on modern systems, all accounts are annually audited through authentic Chartered Accountant Firm.[7]\n" +
                "In July-2016, Saylani Welfare announced that trust will start 5 new projects: (1) Saylani University for women, (2) Flour distribution in Thar district of Sindh, (3) School project in Rural Sindh, (4) Saylani City for poor families; and (5) Saylani mobile shops, this project will provide at least 5,000 mobile shops, and a source of bread-earning to unemployed poor youths[8]");

        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.saylani);
        imageView.setVisibility(View.VISIBLE);
    }
}
