package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}