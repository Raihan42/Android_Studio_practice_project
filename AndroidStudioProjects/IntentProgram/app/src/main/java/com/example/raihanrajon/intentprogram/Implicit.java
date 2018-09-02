package com.example.raihanrajon.intentprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Implicit extends AppCompatActivity {

    Button button;
    EditText editText;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        button = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.edit);
        string = editText.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Implicit.this,ShowText.class);
                intent.putExtra("input",string);
                startActivity(intent);
            }
        });
    }
}
