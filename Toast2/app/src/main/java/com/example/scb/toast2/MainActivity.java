package com.example.scb.toast2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public  void showtoast(View view)
    {

        Toast toast= new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);
        LayoutInflater inflater= getLayoutInflater();
        View aa=inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.root));
        toast.setView(aa);
        toast.show();
  }

}




























