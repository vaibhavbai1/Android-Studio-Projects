package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;
    EditText et1,et2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.button2);
        bt2=findViewById(R.id.button3);
        bt3=findViewById(R.id.button4);
        bt4=findViewById(R.id.button5);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        t = findViewById(R.id.textView);
    }

    public void add(View obj){
        String str1 = et1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = et2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int res = num1+num2;
        t.setText(String.valueOf(res));
    }
    public void sub(View obj1){
        String str1 = et1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = et2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int res = num1-num2;
        t.setText(String.valueOf(res));
    }
    public void mul(View obj2){
        String str1 = et1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = et2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int res = num1*num2;
        t.setText(String.valueOf(res));
    }
    public void div(View obj3){
        String str1 = et1.getText().toString();
        int num1 = Integer.parseInt(str1);
        String str2 = et2.getText().toString();
        int num2 = Integer.parseInt(str2);
        int res = num1/num2;
        t.setText(String.valueOf(res));
    }
    public void clear(View obj4){
        Intent i2 = new Intent(MainActivity.this,MainActivity.class);
        startActivity(i2);
    }
}
