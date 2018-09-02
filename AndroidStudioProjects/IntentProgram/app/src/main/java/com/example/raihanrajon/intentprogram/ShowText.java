package com.example.raihanrajon.intentprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowText extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        textView = (TextView) findViewById(R.id.textview1);
       // Bundle bundle = getIntent().getExtras();
        //String string = bundle.getString("input");

        textView.setText(getIntent().getExtras().getString("input"));
    }
}
