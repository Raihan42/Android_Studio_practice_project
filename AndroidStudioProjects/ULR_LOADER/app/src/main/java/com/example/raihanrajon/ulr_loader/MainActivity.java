package com.example.raihanrajon.ulr_loader;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    Button button;
    ImageButton btnf,btny,btng;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
       btnf = (ImageButton) findViewById(R.id.btnf);
        btny = (ImageButton) findViewById(R.id.btny);
        btng = (ImageButton) findViewById(R.id.btng);

        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();

                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(string));
                startActivity(intent);
            }
        });


        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = "https://www.facebook.com";

                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(string));
                startActivity(intent);
            }
        });


        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = "https://www.gmail.com";

                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(string));
            }
        });


        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = "https://youtube.com";
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(string));
                startActivity(intent);
            }

            });




        myWebView = (WebView) findViewById(R.id.web);

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        myWebView.loadUrl("http://google.com/");

        myWebView.setWebViewClient(new WebViewClient());
    }


    @Override
    public void onBackPressed() {

        if(myWebView.canGoBack())
        {
            myWebView.goBack();
        }

        else {

            super.onBackPressed();}


    }



}
