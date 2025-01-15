package org.example;

import java.util.List;

public class Charakter {
    private int id;
    private String name;
    private String region;
    private List<Product> products;

    public Charakter(int id, String name, String region) {
        this.id = id;
        this.name = name;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Product> getProdukteList() {
        return products;
    }

    public void setProdukteList(List<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
}
