package com.example.chirag.task2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg)
        {
            Intent i = new Intent(MainActivity.this,secondActivity.class);
            startActivity(i);
        }
    };


    Bitmap bit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView iv =(ImageView)findViewById(R.id.iv);
        Button button =(Button)findViewById(R.id.button);
        Button next = (Button)findViewById(R.id.next);

        Picasso.with(getApplicationContext()).load("https://static.pexels.com/photos/8700/wall-animal-dog-pet.jpg").into(iv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setRotation(90);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h.sendEmptyMessage(0);
            }
        });

    }


}
