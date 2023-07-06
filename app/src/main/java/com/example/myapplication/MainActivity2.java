package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.tv2);
        Intent intent = getIntent();

        String getname = intent.getStringExtra("name");
        int getnum = intent.getIntExtra("num" , 0);
        textView.setText("name  " + getname +"   "+ getnum);



    }
}