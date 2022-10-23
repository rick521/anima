package cn.xrick.anima;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.airbnb.lottie.LottieAnimationView animationView = findViewById(R.id.animation_view);
        animationView.playAnimation();
    }
}