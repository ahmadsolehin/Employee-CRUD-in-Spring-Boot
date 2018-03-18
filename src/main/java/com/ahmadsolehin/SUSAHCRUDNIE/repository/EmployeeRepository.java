package com.ahmadsolehin.SUSAHCRUDNIE.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ahmadsolehin.SUSAHCRUDNIE.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByNameContaining(String q);

}