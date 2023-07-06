package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public Button btn;
public EditText etname , etnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn = (Button) findViewById(R.id.button);
         etname = (EditText) findViewById(R.id.editTextTextEmailAddress);
         etnum = (EditText) findViewById(R.id.editTextNumber);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
//                 get data from edittext;
                 String Name = etname.getText().toString();
                 String Num = etnum.getText().toString();
//                 pass data

                 Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                 intent.putExtra( "name",Name);
                 intent.putExtra( "num",Num);
                 startActivity(intent);

             }
         });


    }
}