package com.rafaelribeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelribeiro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
