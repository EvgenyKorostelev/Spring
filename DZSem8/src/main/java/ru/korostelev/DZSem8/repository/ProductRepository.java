package ru.korostelev.DZSem8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.korostelev.DZSem8.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}
