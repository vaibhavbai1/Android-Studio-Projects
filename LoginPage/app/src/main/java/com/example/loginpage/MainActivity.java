package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button k;
    EditText et,et2;
    TextView te,te2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        k=findViewById(R.id.button);
        et=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        te=findViewById(R.id.textView);
        te2=findViewById(R.id.textView2);
    }

    public void login(View obj){

        String data = et.getText().toString();
        Intent i=new Intent(MainActivity.this, B.class);
        i.putExtra("k",data);
        startActivity(i);
    }
}
