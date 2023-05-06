package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class A4 extends AppCompatActivity {

    TextView t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);
        t6=findViewById(R.id.textView6);

        Intent i3 =getIntent();
        String r = i3.getStringExtra("l");
        t6.setText(r);
    }
}
