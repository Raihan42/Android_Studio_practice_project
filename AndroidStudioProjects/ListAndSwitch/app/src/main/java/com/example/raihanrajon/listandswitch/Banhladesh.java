package com.example.raihanrajon.listandswitch;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Banhladesh extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banhladesh);


        mediaPlayer = MediaPlayer.create(Banhladesh.this,R.raw.song);
        mediaPlayer.start();








    }

    @Override
    protected void onStop() {
        mediaPlayer.release();
        super.onStop();
    }
}
