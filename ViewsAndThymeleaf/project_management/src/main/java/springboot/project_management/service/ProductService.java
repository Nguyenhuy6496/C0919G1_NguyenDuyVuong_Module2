package springboot.project_management.service;

import springboot.project_management.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> ShowAll();

    void save(Product product);

    void update(int id, Product product);

    void remove(int id);

    Product findById(int id);
}
