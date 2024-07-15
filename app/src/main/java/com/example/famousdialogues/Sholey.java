package com.example.famousdialogues;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Sholey extends AppCompatActivity {
    ImageView s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholey);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);

        final MediaPlayer jethalal=MediaPlayer.create(this,R.raw.s11);
        final MediaPlayer daya=MediaPlayer.create(this,R.raw.s33);
        final MediaPlayer tapu=MediaPlayer.create(this,R.raw.s44);
        final MediaPlayer chachaji=MediaPlayer.create(this,R.raw.s22);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jethalal.start();
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chachaji.start();
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daya.start();
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapu.start();
            }
        });
    }
}