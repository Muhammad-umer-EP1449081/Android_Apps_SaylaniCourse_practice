package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener mcompletelistener = new MediaPlayer.OnCompletionListener() {


        @Override
        public void onCompletion(MediaPlayer mp) {
            releasedMediaPlayer();
        }
    };
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //  LinearLayout root_view= (LinearLayout) findViewById(R.id.numbers_root_view);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("where are you going","minto wukus",R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name","tinna oyaasena",R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is ......","oyaaset",R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling","mickakses",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("Are you comming","kuchi achit",R.raw.phrase_are_you_coming));
        words.add(new Word("YEs, I m coming","eenes aa",R.raw.phrase_yes_im_coming));
        words.add(new Word("I,m coming","hee eenem",R.raw.phrase_im_coming));
        words.add(new Word("Let's Go","eenam",R.raw.phrase_lets_go));
        words.add(new Word("Come here","yoowutis",R.raw.phrase_come_here));
        words.add(new Word("Come back","enni nem",R.raw.phrase_come_here));



        WordAdapter flavorAdapter = new WordAdapter(this, words,R.color.category_phrases);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Word word = words.get(position);

                releasedMediaPlayer();

                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(mcompletelistener);




            }
        });



     /*   WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView lv = (ListView) findViewById(R.id.list);

        lv.setAdapter(itemsAdapter);
*/

    }

    private void releasedMediaPlayer()
    {

        if(mediaPlayer !=null)
        {

            mediaPlayer.release();
        }
        else
        {
            mediaPlayer = null;
        }


    }



}
