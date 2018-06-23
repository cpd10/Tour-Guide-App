package com.example.android.tourguide;

/**
 * Created by dhook_000 on 1/11/2018.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<CityAttraction> attraction = new ArrayList<CityAttraction>();
        attraction.add(new CityAttraction(getResources().getString(R.string.griffith),getResources().getString(R.string.griffithAdd),R.drawable.griffith));
        attraction.add(new CityAttraction(getResources().getString(R.string.pier),getResources().getString(R.string.pierAdd),R.drawable.pier));
        attraction.add(new CityAttraction(getResources().getString(R.string.disney),getResources().getString(R.string.disneyAdd),R.drawable.disney));
        attraction.add(new CityAttraction(getResources().getString(R.string.walk),getResources().getString(R.string.walkAdd),R.drawable.walk));

        CityAttractionAdapter attractionAdapter = new CityAttractionAdapter(this, attraction);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

    }
}
