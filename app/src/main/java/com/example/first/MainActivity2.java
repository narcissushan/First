package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    private void show(){
        TextView show=findViewById(R.id.score1);
        show.setText(String.valueOf(score));
    }

    public void btn3(View V){
        score += 3;
        show();
    }

    public void btn2(View V){
        score += 2;
        show();
    }

    public void btn1(View V){
        score += 1;
        show();
    }

    public void button(View V){
        score = 0;
        show();
    }
}