package com.casestudy.springbootecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.springbootecommerce.model.User;

/**
 * The Interface UserRepository.
 *
 * @author 
 * @version 1.0
 */
public interface UserRepository extends JpaRepository<User, String> {

}
