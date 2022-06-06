package com.rafaelribeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelribeiro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
