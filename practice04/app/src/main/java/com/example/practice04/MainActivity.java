package com.example.practice04;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button sendButton;
    EditText inputText;
    TextView lenText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button)findViewById(R.id.sendButton);
        inputText = (EditText)findViewById(R.id.inputText);
        lenText = (TextView)findViewById(R.id.lenText);
    }

    public int getTextLen(){
        return 0;

    }


}