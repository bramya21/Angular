package com.example.demo;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptDBDemo extends JpaRepository<Departement, Integer> {

}
