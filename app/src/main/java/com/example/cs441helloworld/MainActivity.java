package com.example.cs441helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    Button helloButton;
    int toggle = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.hello_text);
        helloButton = (Button) findViewById(R.id.hello_button);
    }
    public void onHelloClick(View view){
        if(toggle==1) {
            helloText.setTextSize(64);
            toggle = 0;
        }
        else{
            helloText.setTextSize(30);
            toggle = 1;
        }
    }
}