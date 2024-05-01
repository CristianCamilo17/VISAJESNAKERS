package com.example.visajesnakers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void parcero (View view){

        Intent parcero =new Intent( this, PARCEROS.class);
          startActivities(new Intent[]{parcero});

    }

   public void LONEW (View view){

        Intent lonew =new Intent(this, LONEW.class);
        startActivities(new Intent[]{lonew});

   }

    public void PARCERA (View view){

        Intent PARCERA =new Intent(this, com.example.visajesnakers.PARCERA.class);
        startActivities(new Intent[]{PARCERA});

    }


    public void TODO (View view){

        Intent TODO =new Intent(this, com.example.visajesnakers.TODO.class);
        startActivities(new Intent[]{TODO});

    }





}




