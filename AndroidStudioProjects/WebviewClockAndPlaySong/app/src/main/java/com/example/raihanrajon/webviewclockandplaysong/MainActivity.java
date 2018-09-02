package com.example.raihanrajon.webviewclockandplaysong;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    Button b1,b2,b3;
    DigitalClock digitalClock;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = (ImageView) findViewById(R.id.imageView);
        b1 = (Button) findViewById(R.id.song);

        b2 = (Button) findViewById(R.id.web);

        b3 = (Button)findViewById(R.id.search);
        digitalClock = (DigitalClock) findViewById(R.id.clock);

        mediaPlayer = MediaPlayer.create(this,R.raw.song);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()!=true)
                {
                    mediaPlayer.start();
                }
                else
                {
                    mediaPlayer.pause();
                }
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Webview.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
            }
        });




    }
}
