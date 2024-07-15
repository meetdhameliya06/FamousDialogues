package com.example.famousdialogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Movies extends AppCompatActivity {
    ImageView m1,m2,m3,m4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        m1 = findViewById(R.id.m1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Movies.this, Sholey.class);
                startActivity(send);
            }
        });

        m2 = findViewById(R.id.m2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Movies.this, tmk.class);
                startActivity(send);
            }
        });

        m3 = findViewById(R.id.m3);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Movies.this, Heraferi.class);
                startActivity(send);
            }
        });
        m4 = findViewById(R.id.m4);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Movies.this, Avengers.class);
                startActivity(send);
            }
        });
    }
}