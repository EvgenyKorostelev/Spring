package ru.korostelev.DZSem3.controller;

import ru.korostelev.DZSem3.entity.Product;

import java.util.UUID;

public interface ProductController {

    Product findProductById(UUID id);

    Product addNewProduct(Product product);

    Product updateProductById(UUID id, Product updatedProduct);

    void deleteProductById(UUID id);
}
