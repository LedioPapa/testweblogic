package com.example.testweblogic.repository;

import com.example.testweblogic.entity.Employee;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>, QuerydslPredicateExecutor<Employee> {
}
