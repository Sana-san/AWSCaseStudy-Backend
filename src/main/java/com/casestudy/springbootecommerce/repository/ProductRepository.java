package com.casestudy.springbootecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.springbootecommerce.model.Product;

/**
 * The Interface ProductRepository.
 *
 * @author 
 * @version 1.0
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
