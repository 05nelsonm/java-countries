package com.zerofivenelsonm.countrysearch;

public class Country {
    private String name;
    private long population;
    private long land_mass_size;
    private int median_age;

    public Country(String name, long population, long land_mass_size, int median_age) {
        this.name = name;
        this.population = population;
        this.land_mass_size = land_mass_size;
        this.median_age = median_age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getLand_mass_size() {
        return land_mass_size;
    }

    public void setLand_mass_size(long land_mass_size) {
        this.land_mass_size = land_mass_size;
    }

    public int getMedian_age() {
        return median_age;
    }

    public void setMedian_age(int median_age) {
        this.median_age = median_age;
    }
}
