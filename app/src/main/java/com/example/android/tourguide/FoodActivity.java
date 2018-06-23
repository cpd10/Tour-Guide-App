package com.example.android.tourguide;

/**
 * Created by dhook_000 on 1/11/2018.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<CityAttraction> attraction = new ArrayList<CityAttraction>();
        attraction.add(new CityAttraction(getResources().getString(R.string.innout),getResources().getString(R.string.inAdd),R.drawable.in_n_out));
        attraction.add(new CityAttraction(getResources().getString(R.string.cpk),getResources().getString(R.string.cpkAdd),R.drawable.cpk));
        attraction.add(new CityAttraction(getResources().getString(R.string.steak),getResources().getString(R.string.steakAdd),R.drawable.bourbon));
        attraction.add(new CityAttraction(getResources().getString(R.string.rigos),getResources().getString(R.string.rigoAdd),R.drawable.rigos));
        attraction.add(new CityAttraction(getResources().getString(R.string.roscoes),getResources().getString(R.string.roscoesAdd),R.drawable.roscoes));

        CityAttractionAdapter attractionAdapter = new CityAttractionAdapter(this, attraction);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

    }
}
