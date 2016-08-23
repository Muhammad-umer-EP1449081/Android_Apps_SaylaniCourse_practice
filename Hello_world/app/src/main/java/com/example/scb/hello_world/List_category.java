package com.example.scb.hello_world;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class List_category extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        final ArrayList<Word> words = new ArrayList<Word>();



        words.add(new Word("Pakistan History",R.drawable.download));
        words.add(new Word("Wonder Of Pakistan",R.drawable.wonders));
        words.add(new Word("Pakistani National Songs",R.drawable.milinagma));
        words.add(new Word("Quaid-E-Azam",R.drawable.qauid));
        words.add(new Word("Allama Iqbal",R.drawable.allama));
        words.add(new Word("Sir Syed Ahmed Khan",R.drawable.sirsyed));
        words.add(new Word("General Raheel Shareef",R.drawable.raheel1));
        words.add(new Word("Shahid Afridi",R.drawable.afridi));
        words.add(new Word("Saylani Inetrnational Trust",R.drawable.saylani));
        words.add(new Word("University of Karachi",R.drawable.uok));




        WordAdapter flavorAdapter = new WordAdapter(List_category.this, words, R.color.category_numbers);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {


                if(position == 0) {
                    Intent i = new Intent(List_category.this, Pakistan_History.class);

                    startActivity(i);
                }

                if(position == 1) {
                    Intent i = new Intent(List_category.this,Wonders_Of_Pakistan.class);

                    startActivity(i);
                }
                if(position == 2) {
                    Intent i = new Intent(List_category.this, National_songs.class);

                    startActivity(i);
                }
                if(position == 3) {
                    Intent i = new Intent(List_category.this,Qauid_E_Azam.class);

                    startActivity(i);
                }
                if(position == 4) {
                    Intent i = new Intent(List_category.this, Allama_iqbal.class);

                    startActivity(i);
                }
                if(position == 5) {
                    Intent i = new Intent(List_category.this, Sir_syed.class);

                    startActivity(i);
                }
                if(position == 6) {
                    Intent i = new Intent(List_category.this, Raheel_Shareef.class);

                    startActivity(i);
                }
                if(position == 7) {
                    Intent i = new Intent(List_category.this, Shahid_Afridi.class);

                    startActivity(i);
                }
                if(position == 8) {
                    Intent i = new Intent(List_category.this, Saylani.class);

                    startActivity(i);
                }
                if(position == 9) {
                    Intent i = new Intent(List_category.this, University_karachi.class);

                    startActivity(i);
                }







            }
        });





    }



}
