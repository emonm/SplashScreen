package com.depth.quran.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashActivity extends Activity {
    private int SPLASH_TIMER = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent streamPlayerHome = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(streamPlayerHome);
                finish();
            }
        }, SPLASH_TIMER);
    }
}