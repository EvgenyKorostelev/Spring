package ru.korostelev.DZSem8.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.korostelev.DZSem8.entity.Product;
import ru.korostelev.DZSem8.repository.ProductRepository;

import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductService {

    private ProductRepository productRepository;


    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product updatedProduct) {
        return productRepository.save(updatedProduct);
    }

    @Override
    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}
