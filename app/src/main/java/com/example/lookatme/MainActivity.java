package com.example.lookatme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;


public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        androidx.core.splashscreen.SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lookAtMe = findViewById(R.id.lookme);
//        getSupportActionBar().hide();
        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback));
        // lookAtMe.setVideoPath("http://website.com/video/mp4/62000/62792m.mp4"); to use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}