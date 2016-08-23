package com.example.scb.intent;

import android.content.Intent;
import android.net.Uri;
import android.service.chooser.ChooserTarget;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void something (View view)
    {
        Intent intent= null,chooser= null;
       if(view.getId()== R.id.button1)
       { intent = new Intent(Intent.ACTION_VIEW);
           intent.setData(Uri.parse("geo:19.076,72.8777"));
           chooser= Intent.createChooser(intent,"Launch Map");
           startActivity(chooser);


       }

        if(view.getId()== R.




                id.button2)
        {

        }

        if(view.getId()== R.id.button3)
        {

        }

        if(view.getId()== R.id.button4)
        {

        }

        if(view.getId()== R.id.button5)
        {

        }











    }



}





































































