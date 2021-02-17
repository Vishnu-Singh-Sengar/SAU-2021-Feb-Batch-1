package com.example.au.couchbasedemo.repository;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.model.Employees;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employees, String> {
	

	   
}