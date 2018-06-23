package com.example.android.tourguide;

/**
 * Created by dhook_000 on 1/11/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<CityAttraction> attraction = new ArrayList<CityAttraction>();
        attraction.add(new CityAttraction(getResources().getString(R.string.sportsLakers),getResources().getString(R.string.staples),R.drawable.lakers));
        attraction.add(new CityAttraction(getResources().getString(R.string.sportsClippers),getResources().getString(R.string.staples),R.drawable.clippers));
        attraction.add(new CityAttraction(getResources().getString(R.string.sportsRams),getResources().getString(R.string.coliseum),R.drawable.rams));
        attraction.add(new CityAttraction(getResources().getString(R.string.sportsDodgers),getResources().getString(R.string.stadium),R.drawable.dodgers));
        attraction.add(new CityAttraction(getResources().getString(R.string.sportsKings),getResources().getString(R.string.staples),R.drawable.kings));

        CityAttractionAdapter attractionAdapter = new CityAttractionAdapter(this, attraction);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

    }
}
