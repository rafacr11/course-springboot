package com.rafaelribeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelribeiro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
