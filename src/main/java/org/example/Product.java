package org.example;

public class Product {
    private String name;
    private double preis;
    private String region;

    public Product(String name, double preis, String region) {
        this.name = name;
        this.preis = preis;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
