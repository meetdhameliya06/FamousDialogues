package com.example.famousdialogues;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hathi extends AppCompatActivity {

    ImageView hi1,hi2,hi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hathi);

        hi1=findViewById(R.id.hi1);
        hi2=findViewById(R.id.hi2);
        hi3=findViewById(R.id.hi3);

        final MediaPlayer hathi=MediaPlayer.create(this,R.raw.hathi);
        final MediaPlayer komal=MediaPlayer.create(this,R.raw.komal);
        final MediaPlayer goli=MediaPlayer.create(this,R.raw.goli);

        hi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hathi.start();
            }
        });
        hi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                komal.start();
            }
        });
        hi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goli.start();
            }
        });



    }
}