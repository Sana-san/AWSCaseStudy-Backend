package com.casestudy.springbootecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.springbootecommerce.model.Category;

/**
 * The Interface CategoryRepository.
 *
 * @author 
 * @version 1.0
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
