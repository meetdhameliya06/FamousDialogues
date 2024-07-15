package com.example.famousdialogues;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class gada extends AppCompatActivity {
    ImageView gi1,gi2,gi3,gi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gada);

        gi1=findViewById(R.id.gi1);
        gi2=findViewById(R.id.gi2);
        gi3=findViewById(R.id.gi3);
        gi4=findViewById(R.id.gi4);

        final MediaPlayer jethalal=MediaPlayer.create(this,R.raw.jethalal);
        final MediaPlayer daya=MediaPlayer.create(this,R.raw.daya);
        final MediaPlayer tapu=MediaPlayer.create(this,R.raw.tapu);
        final MediaPlayer chachaji=MediaPlayer.create(this,R.raw.chachaji);

        gi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jethalal.start();
            }
        });
        gi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chachaji.start();
            }
        });
        gi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daya.start();
            }
        });
        gi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapu.start();
            }
        });

    }
}