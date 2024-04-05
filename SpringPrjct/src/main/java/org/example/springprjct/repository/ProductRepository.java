package org.example.springprjct.repository;

import org.example.springprjct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByNameContains(String m);
    List<Product> findByPriceGreaterThan(double m);
    void deleteById(Long id);






}
