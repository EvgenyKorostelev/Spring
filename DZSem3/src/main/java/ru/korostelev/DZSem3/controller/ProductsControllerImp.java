package ru.korostelev.DZSem3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.korostelev.DZSem3.entity.Product;
import ru.korostelev.DZSem3.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsControllerImp implements ProductsController {

    @Autowired
    private ProductService productService;

    @Override
    @GetMapping("/list")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }
}
