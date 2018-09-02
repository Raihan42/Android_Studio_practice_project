package com.example.raihanrajon.listandswitch;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class India extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        mediaPlayer = MediaPlayer.create(India.this,R.raw.tare);
        mediaPlayer.start();
    }
}
