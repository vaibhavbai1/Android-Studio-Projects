package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDb extends SQLiteOpenHelper {
    public MyDb(@Nullable Context context) {
        super(context,"Piet",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tab="CREATE TABLE student(roll INTEGER,name TEXT,mobile INTEGER,branch TEXT)";
        db.execSQL(tab);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void add_data(int e1, String e2, int e3, String e4 ){
        SQLiteDatabase obj = getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("roll", e1);
        c.put("name", e2);
        c.put("mobile", e3);
        c.put("branch", e4);

        obj.insert("student",null,c);
        obj.close();
    }

    public Cursor getAllInfo(){
        SQLiteDatabase obj=getWritableDatabase();

        Cursor c = obj.rawQuery("SELECT * FROM Student",null);
        return c;
    }

}
