package com.example.android.tourguide;

/**
 * Created by dhook_000 on 1/13/2018.
 */

public class CityAttraction
{
    private String address;
    private String name;
    private int imageID;

    public CityAttraction(String attraction_name, String attraction_address, int attraction_imageID)
    {
        name = attraction_name;
        address = attraction_address;
        imageID = attraction_imageID;
    }

    public String getName(){return name;}
    public String getAddress(){return address;}
    public int getImageID(){return imageID;}
}
