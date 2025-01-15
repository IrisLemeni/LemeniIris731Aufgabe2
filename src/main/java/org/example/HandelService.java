package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HandelService {
    private final Repository<Product> productRepo;
    private final Repository<Charakter> customerRepo;

    public HandelService(Repository<Product> productRepo, Repository<Charakter> customerRepo) {
        this.productRepo = productRepo;
        this.customerRepo = customerRepo;
    }
    public Product getProduct(String name){
        int id = -1;
        for (Product p : productRepo.getAll()) {
            if (p.getName().equals(name))
            {id = productRepo.getAll().indexOf(p); break;}
        }
        return productRepo.getElement(id);
    }

    public void addProduct(String name, double price, String region) {
        productRepo.add(new Product(name, price, region));
    }

    public void addCustomer(int id, String name, String location) {
        customerRepo.add(new Charakter(id, name, location));
    }

    public void assignProductToCharakter(int customerId, String productName) {
        Charakter customer = customerRepo.getAll().stream()
                .filter(c -> c.getId() == customerId)
                .findFirst()
                .orElse(null);
        Product product = productRepo.getAll().stream()
                .filter(p -> p.getName().equals(productName))
                .findFirst()
                .orElse(null);

        if (customer != null && product != null) {
            customer.addProduct(product);
        }
    }


    public List<Product> getAllProducts() {
        return productRepo.getAll();
    }

    public List<Charakter> getAllCustomers() {
        return customerRepo.getAll();
    }
}
