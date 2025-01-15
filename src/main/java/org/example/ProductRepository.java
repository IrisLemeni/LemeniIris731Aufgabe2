package repositories;

import org.example.Product;
import org.example.Repository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {
    private final List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

}