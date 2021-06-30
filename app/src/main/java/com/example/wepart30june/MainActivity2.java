package com.example.wepart30june;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView maedtxt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        maedtxt1=findViewById(R.id.view1);
        String name=getIntent().getStringExtra("username");
        maedtxt1.setText(name);


    }


}