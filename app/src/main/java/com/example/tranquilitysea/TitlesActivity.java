package com.example.tranquilitysea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.steamcrafted.materialiconlib.MaterialIconView;

public class TitlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titles);

        MaterialIconView playWindChimes = findViewById(R.id.windchimesplay);
        playWindChimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), PlaySong.class);
                startActivity(playintent);
            }
        });

        MaterialIconView playTropicalBeach = findViewById(R.id.playtropicalbeach);
        playTropicalBeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), PlaySong.class);
                startActivity(playintent);
            }
        });
        MaterialIconView playPineForest = findViewById(R.id.playpineforest);
        playPineForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), PlaySong.class);
                startActivity(playintent);
            }
        });

        MaterialIconView playWaterFalls = findViewById(R.id.playwaterfalls);
        playWaterFalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), PlaySong.class);
                startActivity(playintent);
            }
        });
        MaterialIconView playCanyonNight = findViewById(R.id.playnightincanyon);
        playCanyonNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), PlaySong.class);
                startActivity(playintent);
            }
        });

        MaterialIconView playMoonson = findViewById(R.id.playmonsoon);
        playMoonson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), PlaySong.class);
                startActivity(playintent);
            }
        });
        MaterialIconView playWetlands = findViewById(R.id.playwetlands);
        playWetlands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), PlaySong.class);
                startActivity(playintent);
            }
        });

        MaterialIconView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playintent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(playintent);
            }
        });
    }
}
