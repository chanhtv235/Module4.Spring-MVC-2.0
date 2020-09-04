package service;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Ô tô fandin", 300, "Vinfast"));
        products.put(2, new Product(2, "Ô tô civil", 400, "HonDa"));
        products.put(3, new Product(3, "Ô tô camry 3.0", 500, "Toyota"));
        products.put(4, new Product(4, "Ô to inova", 600, "Toyota"));
        products.put(5, new Product(5, "Ô tô tucsion", 700, "HuynDai"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
