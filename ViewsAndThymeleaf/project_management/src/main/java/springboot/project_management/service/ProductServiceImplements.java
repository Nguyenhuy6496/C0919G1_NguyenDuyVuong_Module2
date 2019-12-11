package springboot.project_management.service;

import springboot.project_management.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImplements implements ProductService {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Iphone", "500$", "Iphone 7", "Apple"));
        productMap.put(2, new Product(2, "Galaxy", "450", "Note 8", "Samsung"));
        productMap.put(3, new Product(3, "Redmi", "400$", "note 6 plus", "Xiaomi"));
        productMap.put(4, new Product(4, "MacBook", "1500$", "Pro 13", "Apple"));
        productMap.put(5, new Product(5, "Laptop", "1000$", "Inspiron 7557", "Dell"));
        productMap.put(6, new Product(6, "Headphone", "100$", "IER-Z1R", "Sony"));
        productMap.put(7, new Product(7, "Camera", "1200", "EOS - 4000D Kit", "Canon"));
    }

    @Override
    public List<Product> ShowAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }
}
