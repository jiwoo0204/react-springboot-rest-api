package com.example.gccoffeeproject.repository;

import com.example.gccoffeeproject.model.Category;
import com.example.gccoffeeproject.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProductJdbcRepository implements ProductRepository {



    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product insert(Product product) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Optional<Product> findById(UUID productId) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> findByName(String productName) {
        return Optional.empty();
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
