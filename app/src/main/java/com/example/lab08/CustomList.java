package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {

        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list");
        }

        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }


}
