package ru.korostelev.DZSem3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.korostelev.DZSem3.entity.Product;
import ru.korostelev.DZSem3.service.ProductService;

import java.util.UUID;

@RestController
@RequestMapping("/products/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable UUID id) {
        return productService.findProductById(id);
    }

    @PostMapping("/new")
    public Product addNewProduct(@RequestBody Product product) {
        return productService.addNewProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProductById(@PathVariable UUID id, @RequestBody Product updatedProduct) {
        Product oldProduct = findProductById(id);
        return productService.updateProduct(oldProduct, updatedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable UUID id) {
        productService.deleteProductById(id);
    }
}
