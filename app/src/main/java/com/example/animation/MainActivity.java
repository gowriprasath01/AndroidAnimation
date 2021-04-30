package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    private ImageView waterImage;
    private AnimationDrawable waterAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waterImage= findViewById(R.id.imageView);
        waterImage.setBackgroundResource(R.drawable.animation);
        waterAnimation = (AnimationDrawable) waterImage.getBackground();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        waterAnimation.start();

        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
             waterAnimation.stop();
//                Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadin_anim);
//                waterImage.startAnimation(startAnimation);
            }
        },50);
        return super.onTouchEvent(event);

    }
}