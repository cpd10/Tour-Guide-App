package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity
{
    LinearLayout food;
    LinearLayout education;
    LinearLayout sports;
    LinearLayout landmarks;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food = (LinearLayout)findViewById(R.id.listFood);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(i);
            }
        });

        education = (LinearLayout)findViewById(R.id.listEducation);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this,EducationActivity.class);
                startActivity(i);
            }
        });

        sports = (LinearLayout)findViewById(R.id.listSports);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this,SportsActivity.class);
                startActivity(i);
            }
        });

        landmarks = (LinearLayout)findViewById(R.id.listLandmarks);
        landmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this,LandmarksActivity.class);
                startActivity(i);
            }
        });

    }
}
