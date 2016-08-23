package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity
{

    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener mcompletelistener = new MediaPlayer.OnCompletionListener() {


        @Override
        public void onCompletion(MediaPlayer mp) {
            releasedMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

      //  LinearLayout root_view= (LinearLayout) findViewById(R.id.numbers_root_view);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("five","temmokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("six","kenekaku",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("seven","kawinta",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("eight","woe",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("nine","naacha",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("ten","masookka",R.drawable.number_ten,R.raw.number_ten));



        WordAdapter flavorAdapter = new WordAdapter(NumbersActivity.this, words, R.color.category_numbers);

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

                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
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















