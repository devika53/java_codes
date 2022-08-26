package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")

public class HomeController {
    private final EmployeeService employeeService;
    @Autowired
    public HomeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/home")
    public String home(){
        return "You are welcome to demo spring boot application";
    }

    @PostMapping("/addEmployee")
    public void registerNewEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.addNewEmployee(employeeDto);
    }
}


