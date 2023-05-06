package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button bt1,bt2,bt3;
    TextView et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw.mc);
        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        et = findViewById(R.id.textView);
    }

    //for playing the music
    public void play(View view){
        mediaPlayer.start();
    }

    //for pausing the music
    public void pause(View view){
        mediaPlayer.pause();
    }
    
    public void stop(View view){
        mediaPlayer.stop();
    }
}
