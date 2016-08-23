package com.example.scb.independence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proceed = (Button) findViewById(R.id.button);

        proceed.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                Intent n= new Intent(MainActivity.this,Categories.class);

                startActivity(n);


            }
        });


    }





}
