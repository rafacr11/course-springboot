package com.rafaelribeiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelribeiro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
