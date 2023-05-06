package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class A3 extends AppCompatActivity {

    Button b3;
    EditText e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
        b3=findViewById(R.id.button3);
        e5=findViewById(R.id.editText6);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = e5.getText().toString();
                Intent k=new Intent(A3.this, A4.class);
                k.putExtra("l",data);
                startActivity(k);
            }
        });
    }
}