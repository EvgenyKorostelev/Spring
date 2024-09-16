package ru.korostelev.DZSem3.controller;

import ru.korostelev.DZSem3.entity.Product;

import java.util.List;

public interface ProductsController {

    List<Product> findAllProducts();
}
