package com.example.au.couchbasedemo.controller;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.model.Employees;
import com.example.au.couchbasedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeRepository employeeRepository;

    
    @PostMapping("/employees")
    public Employees addEmployeePost(@RequestBody Employees newEmployee) {
        return employeeRepository.save(newEmployee);
    }
    
    @GetMapping("/employees/{id}")
    public Optional<Employees> getEmployee(@PathVariable String id) {
        if (employeeRepository.existsById(id)) {
            return employeeRepository.findById(id);
        } else
            return Optional.empty();
    }
    
    @GetMapping("/employees/pincode/{pincode}")
    public List<Employees> getEmployeeByPincode(@PathVariable String pincode) {
        List<Employees> employeesList=new ArrayList<>();
        employeeRepository.findAll().forEach(Employees->{
          if(Employees.getPincode().equals(pincode))
          {
              employeesList.add(Employees);
          }
        });

        return employeesList;

    }
    

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable String id) {
        employeeRepository.deleteById(id);
    }
    

}