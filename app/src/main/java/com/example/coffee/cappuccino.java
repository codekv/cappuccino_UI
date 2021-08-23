package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.number.Precision;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class cappuccino extends AppCompatActivity {

    MaterialButton plus_button , minus_button;
    TextView total_checkout , total_price;

    int coffee_quantity = 1;
    float price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cappuccino);

        plus_button = findViewById(R.id.plus_id);
        minus_button = findViewById(R.id.minus_id);
        total_checkout = findViewById(R.id.total_checkout_id);
        total_price = findViewById(R.id.total_price_id);

        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                increment();
            }
        });

        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                decrement();
            }
        });

    }

    public void increment(){
        if(coffee_quantity >= 10){
            return;
        }
        coffee_quantity++;
        total_checkout.setText(String.valueOf(coffee_quantity));
        price = coffee_quantity * 4.55f;
        total_price.setText(" $ " + String.format("%.2f",price));

    }

    public void decrement(){
        if(coffee_quantity <= 1){
            return;
        }
        coffee_quantity--;
        total_checkout.setText(String.valueOf(coffee_quantity));
        price = coffee_quantity * 4.55f;
        total_price.setText(" $ " + String.format("%.2f",price));
    }

}