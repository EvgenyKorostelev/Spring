package ru.korostelev.DZSem3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.korostelev.DZSem3.entity.Product;
import ru.korostelev.DZSem3.repository.ProductRepository;

import java.util.List;
import java.util.UUID;


@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void addNewProduct(Product product) {
        productRepository.saveNewProduct(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }

    @Override
    public Product findProductById(UUID uuid) {
        return productRepository.findProductById(uuid);
    }

    @Override
    public Product updateProduct(Product oldProduct, Product updatedProduct) {
        return productRepository.saveEditProduct(oldProduct, updatedProduct);
    }

    @Override
    public void deleteProductById(UUID uuid) {
        productRepository.deleteProductById(uuid);
    }
}
