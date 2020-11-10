package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ntroots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ntroots=findViewById(R.id.ntroots);
        ntroots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data =ntroots.getText().toString();
                Intent intent=new Intent(MainActivity.this,Secondactivity.class);
                intent.putExtra("dataname",data);
                startActivity(intent);
            }
        });
    }
}