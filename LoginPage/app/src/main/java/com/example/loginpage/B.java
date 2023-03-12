package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class B extends AppCompatActivity {

    Button p;
    TextView te3,te4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        p=findViewById(R.id.button3);
        te3=findViewById(R.id.textView4);
        te4=findViewById(R.id.textView3);

        Intent i3 =getIntent();
        String r = i3.getStringExtra("k");
        te3.setText(r);
    }

    public void logout(View obj2){
        Intent i2 = new Intent(B.this,MainActivity.class);
        startActivity(i2);
    }
}
