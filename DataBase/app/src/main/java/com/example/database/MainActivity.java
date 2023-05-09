package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1,b2;
    MyDb obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
        e4=findViewById(R.id.et4);
        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.button2);
        obj=new MyDb(MainActivity.this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    obj.add_data(Integer.parseInt(e1.getText().toString()), e2.getText().toString(), Integer.parseInt(e3.getText().toString()), e4.getText().toString());
                    Toast.makeText(MainActivity.this, "Data Inserted....", Toast.LENGTH_SHORT).show();
                    cln();
                }catch (Exception t){
                    Toast.makeText(MainActivity.this, ""+t, Toast.LENGTH_SHORT).show();
                }

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(MainActivity.this,Display_Info.class);
                startActivity(obj);
            }
        });
    }

    public void cln(){
        e1.setText(null);
        e4.setText(null);
        e3.setText(null);
        e2.setText(null);
        e1.requestFocus();
    }
}