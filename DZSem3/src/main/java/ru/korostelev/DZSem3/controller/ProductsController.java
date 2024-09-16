package ru.korostelev.DZSem3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.korostelev.DZSem3.entity.Product;
import ru.korostelev.DZSem3.service.ProductService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService productService;


    @GetMapping()
    public List<Product> findAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable UUID id) {
        return productService.findProductById(id);
    }

    @PostMapping("/product/new")
    public void addNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
    }

    @PutMapping("/product/{id}")
    public Product updateProductById(@PathVariable UUID id, @RequestBody Product updatedProduct) {
        Product oldProduct = findProductById(id);
        return productService.updateProduct(oldProduct, updatedProduct);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable UUID id) {
        productService.deleteProductById(id);
    }
}
