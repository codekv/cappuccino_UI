package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout cappuccino_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cappuccino_layout = findViewById(R.id.cappuccino_id);
        cappuccino_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cappuccino_intent = new Intent(MainActivity.this,cappuccino.class);
                startActivity(cappuccino_intent);
            }
        });
    }
}