package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {
    TextView Learn,learn2;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Learn=findViewById(R.id.Learn);
        learn2=findViewById(R.id.learn2);

        Intent intent=getIntent();
        data=intent.getStringExtra("dataname");

        Learn.setText("Best android tutorial by"+" " +data);
        learn2.setText("learn with"+" " +data);
    }
}