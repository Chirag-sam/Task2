package com.example.chirag.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(ThirdActivity.this,MainActivity.class);
        startActivity(i);
    }
}
