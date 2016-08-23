package com.example.scb.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    public void submitOrder(View view)

    {

        EditText name= (EditText) findViewById(R.id.name_field);
        String name_edittext= name.getText().toString();

        CheckBox whippedcream = (CheckBox) findViewById(R.id.checkBox1);
        boolean value_whippedcream = whippedcream.isChecked();

        CheckBox chocolate = (CheckBox) findViewById(R.id.checkBox2);
        boolean value_chocolate = chocolate.isChecked();


        String message = "" + name_edittext + "  you have order Topping Whippedcream = " +value_whippedcream + " and Chocolate = " +value_chocolate +" and your total price is " +(quantity*5);


        displayPrice(quantity * 5);
        displayorderdetail(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number)
    {

        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price value on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


   private void displayorderdetail(String s)
   {
       TextView detail = (TextView) findViewById(R.id.order_detail);
       detail.setText(s);

   }


}
