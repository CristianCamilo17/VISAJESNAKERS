package com.example.visajesnakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class LONEW extends AppCompatActivity {
   VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lonew);
        VideoView mivideo=findViewById(R.id.VIDEO1);


        String VIDEO1= "android.resource://"+ getPackageName() + "/" + R.raw.video;
        Uri uri= Uri.parse(VIDEO1);
        mivideo.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(mivideo);



    }
    public void parcero (View view){

        Intent parcero =new Intent( this, PARCEROS.class);
        startActivities(new Intent[]{parcero});

    }

    public void VOLVER (View view){

        Intent volver =new Intent(this, MainActivity.class);
        startActivities(new Intent[]{volver});




    }




}