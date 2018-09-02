package com.example.raihanrajon.webviewclockandplaysong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Webview extends AppCompatActivity {

   WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
     webview = (WebView) findViewById(R.id.webv);

     webview.loadUrl("https://www.baust.edu.bd");





    }
}
