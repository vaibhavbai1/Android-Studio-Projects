package com.example.house;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas = new Canvas(bg);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawRect(200, 500, 550, 900, paint);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(30);
        canvas.drawLine(200,500,550,500,paint);
        canvas.drawLine(200,500,375,100,paint);
        canvas.drawLine(375,100,550,500,paint);
        canvas.drawRect(300, 700, 450, 900, paint);
    }
}
