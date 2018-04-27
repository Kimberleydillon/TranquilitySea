package com.example.tranquilitysea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout dayView = findViewById(R.id.day);
        dayView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dayintent = new Intent(MainActivity.this, DayActivity.class);
                startActivity(dayintent);
            }
        });

        LinearLayout nightView = findViewById(R.id.night);
        nightView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightintent = new Intent(MainActivity.this, NightActivity.class);
                startActivity(nightintent);
            }
        });

        LinearLayout titleView = findViewById(R.id.title);
        titleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent titleintent = new Intent(MainActivity.this, TitlesActivity.class);
                startActivity(titleintent);
            }
        });

        LinearLayout artistView = findViewById(R.id.artists);
        artistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistintent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistintent);
            }
        });

        LinearLayout storeView = findViewById(R.id.store);
        storeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeintent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(storeintent);
            }
        });

    }
}
