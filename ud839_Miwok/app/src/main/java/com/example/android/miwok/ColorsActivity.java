package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


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
        words.add(new Word("red","wetetti",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("musturd yellow","chiwita",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Word("dusty yellow","topiisa",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("green","chokokki",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("brown","takaakki",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("gray","topoppi",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("white","kelelli",R.drawable.color_white,R.raw.color_white));




        WordAdapter flavorAdapter = new WordAdapter(this, words,R.color.category_colors);

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

                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
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
