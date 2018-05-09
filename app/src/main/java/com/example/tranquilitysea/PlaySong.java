package com.example.tranquilitysea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.steamcrafted.materialiconlib.MaterialIconView;

public class PlaySong extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_song);

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
