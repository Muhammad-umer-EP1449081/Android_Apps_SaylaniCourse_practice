package com.example.scb.hello_world;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class National_songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        final ArrayList<Word> words = new ArrayList<Word>();



        words.add(new Word("RaheHaq Kay Shaheedon",R.drawable.download));
        words.add(new Word("Dil Dil Pakistan",R.drawable.wonders));
        words.add(new Word("Jazba Junoon",R.drawable.milinagma));
        words.add(new Word("Hum Zinda Qoum Hain",R.drawable.qauid));
        words.add(new Word("Ye Watan Tumhara Hai",R.drawable.allama));
        words.add(new Word("Is Parcham Kay Saaye",R.drawable.sirsyed));
        words.add(new Word("Aay Watan Pak Watan",R.drawable.raheel1));
        words.add(new Word("Watan Ki Mitti",R.drawable.afridi));
        words.add(new Word("Mera Paigham Pakistan",R.drawable.saylani));




        DescripAdapter flavorAdapter = new DescripAdapter(National_songs.this, words, R.color.category_numbers);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);



    }

    }
