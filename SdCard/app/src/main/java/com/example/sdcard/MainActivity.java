package com.example.sdcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    Button write, read, clear;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.editText2);
        write=(Button)findViewById(R.id.button4);
        read=(Button)findViewById(R.id.button5);
        clear=(Button)findViewById(R.id.button6);

        write.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String message=et.getText().toString();
                try {
                    File f = new File("/sdcard/myfile.txt");
                    f.createNewFile();
                    FileOutputStream fout=new FileOutputStream(f);
                    fout.write(message.getBytes());
                    fout.close();
                    Toast.makeText(getBaseContext(), "Data Written in SDCARD", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getBaseContext(),e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message;
                String buf = "";
                try{
                    File f = new File("/sdcard/myfile.txt");
                    FileInputStream fin = new FileInputStream(f);
                    BufferedReader br = new BufferedReader(new InputStreamReader(fin));
                    while ((message=br.readLine())!=null){
                        buf += message;
                    }
                    et.setText(buf);
                    br.close();
                    fin.close();
                    Toast.makeText(getBaseContext(), "Data Recived from SDCARD", Toast.LENGTH_LONG).show();
                }
                catch (Exception e){
                    Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });

    }
}
