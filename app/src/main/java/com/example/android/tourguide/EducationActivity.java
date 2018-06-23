package com.example.android.tourguide;

/**
 * Created by dhook_000 on 1/11/2018.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EducationActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<CityAttraction> attraction = new ArrayList<CityAttraction>();
        attraction.add(new CityAttraction(getResources().getString(R.string.ucla),getResources().getString(R.string.uclaAdd),R.drawable.ucla));
        attraction.add(new CityAttraction(getResources().getString(R.string.usc),getResources().getString(R.string.uscAdd),R.drawable.usc));
        attraction.add(new CityAttraction(getResources().getString(R.string.beach),getResources().getString(R.string.beachAdd),R.drawable.beach));
        attraction.add(new CityAttraction(getResources().getString(R.string.csun),getResources().getString(R.string.csunAdd),R.drawable.csun));

        CityAttractionAdapter attractionAdapter = new CityAttractionAdapter(this, attraction);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

    }
}
