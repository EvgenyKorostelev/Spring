package ru.korostelev.DZSem3.repository;

import org.springframework.stereotype.Repository;
import ru.korostelev.DZSem3.entity.Product;

import java.util.List;
import java.util.UUID;


public interface ProductRepository {

    void saveNewProduct(Product product);

    Product saveEditProduct(Product oldProduct, Product updatedProduct);

    Product findProductById(UUID uuid);

    void deleteProductById(UUID uuid);

    List<Product> findAllProducts();
}
