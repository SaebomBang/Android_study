package com.example.practice03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2;
    Button upButton, downButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        upButton = (Button)findViewById(R.id.upButton);
        downButton = (Button) findViewById(R.id.downButton);


    }

    public void onUpbtnClick(View view){
        imageView1.setImageResource(R.drawable.d1);
        imageView2.setImageResource(0);
    }
    public void onDownbtnClick(View view){
        imageView1.setImageResource(0);
        imageView2.setImageResource(R.drawable.d1);
    }
}