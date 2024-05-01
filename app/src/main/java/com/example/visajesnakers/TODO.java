package com.example.visajesnakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TODO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
    }
    public void VOLVER (View view){

        Intent volver =new Intent(this, MainActivity.class);
        startActivities(new Intent[]{volver});




    }


    public void LONEW (View view){

        Intent lonew =new Intent(this, LONEW.class);
        startActivities(new Intent[]{lonew});

    }



    public void PARCERO (View view){

        Intent PARCERO =new Intent(this, PARCEROS.class);
        startActivities(new Intent[]{PARCERO});

    }
    public void PARCERA (View view){

        Intent PARCERA =new Intent(this, com.example.visajesnakers.PARCERA.class);
        startActivities(new Intent[]{PARCERA});

    }





}





