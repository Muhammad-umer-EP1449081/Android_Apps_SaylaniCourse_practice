package com.example.scb.toastapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclicktoast(View v)
    {
        Toast toast= new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);
        LayoutInflater inflator= getLayoutInflater();
        View apperence=inflator.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast1));
        toast.setView(apperence);
        toast.show();




    }



}





































