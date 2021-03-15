package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ImageView ball = (ImageView)findViewById(R.id.ballImage);
        final int[] balls ={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4, R.drawable.ball5};
        Button btn =(Button) findViewById(R.id.Askbutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random ganerator = new Random();
                int number = ganerator.nextInt(5);
                ball.setImageResource(balls[number]);
            }
        });
    }










}
