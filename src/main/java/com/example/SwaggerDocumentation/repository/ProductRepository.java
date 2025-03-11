package com.example.SwaggerDocumentation.repository;

import com.example.SwaggerDocumentation.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
} 