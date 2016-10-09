package com.example.scb.report_card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student_model s = new Student_model("Muhammad Umer","Muhammad Tahir","24-3-1995","1449081","Bachelor","UOK");


        EditText ed1 = (EditText) findViewById(R.id.editText1);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        EditText ed3 = (EditText) findViewById(R.id.editText3);
        EditText ed4 = (EditText) findViewById(R.id.editText4);
        EditText ed5 = (EditText) findViewById(R.id.editText5);
        EditText ed6 = (EditText) findViewById(R.id.editText6);


        ed1.setText(s.getName());
        ed2.setText(s.getFathername());
        ed3.setText(s.getDateofbirth());
        ed4.setText(s.getRollno());
        ed5.setText(s.getEducation());
        ed6.setText(s.getNameofinstitution());

    }
}
