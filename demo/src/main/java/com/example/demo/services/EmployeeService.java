package com.example.demo.services;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

@Autowired
public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
}
public void addNewEmployee(EmployeeDto Employeedetails) {
    Employee e =new Employee();
    e.setFirstName(Employeedetails.getFirstName());
    e.setLastName(Employeedetails.getLastName());
    e.setCreatedAt(Employeedetails.getCreatedAt());
    employeeRepository.save(e);
}
}
