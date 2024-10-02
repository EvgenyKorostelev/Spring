package ru.korostelev.DZSem8.service;

import ru.korostelev.DZSem8.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    Product findProductById(Integer id);

    List<Product> findAllProducts();

    Product updateProduct(Product updatedProduct);

    void deleteProductById(Integer id);

}
