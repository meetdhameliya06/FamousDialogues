package com.example.famousdialogues;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class iyer extends AppCompatActivity {
    ImageView ei1,ei2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iyer);

        ei1=findViewById(R.id.ei1);
        ei2=findViewById(R.id.ei2);

        final MediaPlayer iyer=MediaPlayer.create(this,R.raw.iyer);
        final MediaPlayer babita=MediaPlayer.create(this,R.raw.babita);

        ei1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iyer.start();
            }
        });
        ei2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                babita.start();
            }
        });
    }
}