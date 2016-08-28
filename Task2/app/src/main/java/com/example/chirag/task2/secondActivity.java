package com.example.chirag.task2;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    String[] colours = {"Violet","Indigo","Orange","Blue","Green","Yellow","Red"};
    AutoCompleteTextView auto;
    Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg)
        {
            Intent i = new Intent(secondActivity.this,ThirdActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        auto =(AutoCompleteTextView)findViewById(R.id.auto);
        Button finalb = (Button)findViewById(R.id.finalb);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,colours);
        auto.setThreshold(1);
        auto.setAdapter(adapter);

        finalb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = auto.getText().toString();
                if(s.equals("Yellow"))
                {
                    h.sendEmptyMessage(0);
                }
                else {
                    Toast.makeText(secondActivity.this ,"Not Yellow!",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
