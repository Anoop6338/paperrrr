package com.example.paperrrr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton, imageButton1, imageButton2,imageButton3;

        imageButton = findViewById(R.id.imageButton);
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);

        imageButton.setScaleX(1.0f);
        imageButton.setScaleY(1.0f);
        imageButton1.setScaleX(1.0f);
        imageButton1.setScaleY(1.0f);
        imageButton2.setScaleX(1.0f);
        imageButton2.setScaleY(1.0f);
        imageButton3.setScaleX(1.0f);
        imageButton3.setScaleY(1.0f);

        imageButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        scaleButton(view,1.2f);
                        break;
                    case MotionEvent.ACTION_UP:
                        scaleButton(view,1.0f);
                        break;
                }
                return false;
            }
        });
        imageButton1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        scaleButton(view,1.2f);
                        break;
                    case MotionEvent.ACTION_UP:
                        scaleButton(view,1.0f);
                        break;
                }
                return false;
            }
        });
        imageButton2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        scaleButton(view,1.2f);
                        break;
                    case MotionEvent.ACTION_UP:
                        scaleButton(view,1.0f);
                        break;
                }
                return false;
            }
        });
        imageButton3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        scaleButton(view,1.2f);
                        break;
                    case MotionEvent.ACTION_UP:
                        scaleButton(view,1.0f);
                        break;
                }
                return false;
            }
        });
    }
    public void openActivity_Anoop(View v){
        Toast.makeText(this, "Opening Anoop", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity_kavita(View v){
        Toast.makeText(this, "Opening Kavita", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,kavita.class);
        startActivity(intent);
    }
    public void openActivity_jatin(View v){
        Toast.makeText(this, "Opening Jatin", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Jatin.class);
        startActivity(intent);
    }
    public void openActivity_amit(View v){
        Toast.makeText(this, "Opening Amit", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Amit.class);
        startActivity(intent);
    }
    private void scaleButton(View view, float scaleValue) {
        ScaleAnimation scaleAnimation= new ScaleAnimation(
                1.0f, scaleValue,
                1.0f, scaleValue,
                Animation.RELATIVE_TO_SELF,0.5f,
                Animation.RELATIVE_TO_SELF,0.5f
        );
        scaleAnimation.setDuration(200);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }


}