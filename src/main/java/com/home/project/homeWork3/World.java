package com.home.project.homeWork3;

import java.io.Serializable;
import java.util.Arrays;

public class World implements Serializable {
    private String[] oceans;
    private String[] continents;
    private String[] countries;

    public World(String[] oceans, String[] continents, String[] countries){
        this.continents = continents;
        this.oceans = oceans;
        this.countries = countries;
    }

    public String[] getOceans() {
        return oceans;
    }

    public void setOceans(String[] oceans) {
        this.oceans = oceans;
    }

    public String[] getContinents() {
        return continents;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "World {" +
                "oceans = " + Arrays.toString(oceans)+
                "continents=" + Arrays.toString(continents)+
                "countries =" + Arrays.toString(countries);
    }
}
