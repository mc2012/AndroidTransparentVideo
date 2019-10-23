package com.android.mxvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.mx.library.MxVideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MxVideoView videoView = findViewById(R.id.mx_video);
        videoView.setVideoFromAssets("wheel.mp4");
    }
}
