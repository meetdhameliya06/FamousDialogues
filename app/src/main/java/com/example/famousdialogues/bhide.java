package com.example.famousdialogues;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class bhide extends AppCompatActivity {
    ImageView bi1,bi2,bi3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhide);


        bi1=findViewById(R.id.bi1);
        bi2=findViewById(R.id.bi2);
        bi3=findViewById(R.id.bi3);

        final MediaPlayer bhide=MediaPlayer.create(this,R.raw.bhide);
        final MediaPlayer madhvi=MediaPlayer.create(this,R.raw.madhvi);
        final MediaPlayer sonu=MediaPlayer.create(this,R.raw.sonu);


        bi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bhide.start();
            }
        });
        bi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                madhvi.start();
            }
        });
        bi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonu.start();
            }
        });




    }
}