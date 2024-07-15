package com.example.famousdialogues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class tmk extends AppCompatActivity {
    ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmk);
        i1 = findViewById(R.id.i1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(tmk.this, gada.class);
                startActivity(send);
            }
        });


        i2 = findViewById(R.id.i2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(tmk.this, bhide.class);
                startActivity(send);
            }
        });

        i3 = findViewById(R.id.i3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(tmk.this, hathi.class);
                startActivity(send);
            }
        });
        i4 = findViewById(R.id.i4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(tmk.this, iyer.class);
                startActivity(send);
            }
        });
    }
}