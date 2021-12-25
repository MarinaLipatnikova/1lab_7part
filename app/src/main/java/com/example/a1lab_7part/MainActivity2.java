package com.example.a1lab_7part;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String text = intent.getStringExtra(com.example.a1lab_7part.MainActivity.EXTRA_TEXT);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(text);
    }
}