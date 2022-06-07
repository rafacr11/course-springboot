package com.rafaelribeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelribeiro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
