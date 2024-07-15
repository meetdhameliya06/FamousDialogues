package com.example.famousdialogues;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Avengers extends AppCompatActivity {
    ImageView a1,a2,a33,a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers);
        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        a33=findViewById(R.id.a33);
        a4=findViewById(R.id.a4);

        final MediaPlayer jethalal=MediaPlayer.create(this,R.raw.a1);
        final MediaPlayer daya=MediaPlayer.create(this,R.raw.a3);
        final MediaPlayer tapu=MediaPlayer.create(this,R.raw.a4);
        final MediaPlayer chachaji=MediaPlayer.create(this,R.raw.a2);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jethalal.start();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chachaji.start();
            }
        });
        a33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daya.start();
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapu.start();
            }
        });

    }
}