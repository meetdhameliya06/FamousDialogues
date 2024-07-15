package com.example.famousdialogues;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Heraferi extends AppCompatActivity {
    ImageView h1,h2,h3,h4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heraferi);

        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);
        h3=findViewById(R.id.h3);
        h4=findViewById(R.id.h4);

        final MediaPlayer jethalal=MediaPlayer.create(this,R.raw.h1);
        final MediaPlayer daya=MediaPlayer.create(this,R.raw.h3);
        final MediaPlayer tapu=MediaPlayer.create(this,R.raw.h4);
        final MediaPlayer chachaji=MediaPlayer.create(this,R.raw.h2);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jethalal.start();
            }
        });
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chachaji.start();
            }
        });
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daya.start();
            }
        });
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapu.start();
            }
        });

    }
}