package com.home.project.homeWork3;

import java.util.Arrays;

public class World2 {
    private String[] oceans2;
    private String[] continents2;
    private String[] countries2;

    public World2(String[] oceans2, String[] continents2, String[] countries2){
        this.continents2 = continents2;
        this.oceans2 = oceans2;
        this.countries2 = countries2;
    }

    public String[] getOceans2() {
        return oceans2;
    }

    public void setOceans2(String[] oceans2) {
        this.oceans2 = oceans2;
    }

    public String[] getContinents2() {
        return continents2;
    }

    public void setContinents2(String[] continents2) {
        this.continents2 = continents2;
    }

    public String[] getCountries2() {
        return countries2;
    }

    public void setCountries2(String[] countries2) {
        this.countries2 = countries2;
    }

    @Override
    public String toString() {
        return "World2 {" +
                "oceans2 = " + Arrays.toString(oceans2)+
                "continents2=" + Arrays.toString(continents2)+
                "countries2 =" + Arrays.toString(countries2);
    }
}

