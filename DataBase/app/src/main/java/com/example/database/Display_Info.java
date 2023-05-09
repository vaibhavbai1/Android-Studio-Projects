package com.example.database;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Display_Info extends AppCompatActivity {

    TextView t1;
    MyDb obj;
    StringBuilder b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView2);
        obj=new MyDb(Display_Info.this);
        b=new StringBuilder();
        try {
            Cursor cursor = obj.getAllInfo();
            if(cursor.getCount()==0){
                t1.setText("Data Not Found");
            }

            while (cursor.moveToNext()){
                b.append(""+cursor.getInt(0)+"\n");
                b.append(""+cursor.getString(1)+"\n");
                b.append(""+cursor.getInt(2)+"\n");
                b.append(""+cursor.getString(3)+"\n");
                b.append("---------------------------"+"\n");

            }

            t1.setText(b.toString());

        }catch (Exception tt){
            Toast.makeText(this, ""+tt, Toast.LENGTH_LONG).show();
        }
    }
}