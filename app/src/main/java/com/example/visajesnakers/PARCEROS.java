package com.example.visajesnakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PARCEROS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parceros);

    }

    public void VOLVER (View view){

        Intent volver =new Intent(this, MainActivity.class);
                 startActivities(new Intent[]{volver});




    }


    public void LONEW (View view){

        Intent lonew =new Intent(this, LONEW.class);
        startActivities(new Intent[]{lonew});

    }


}