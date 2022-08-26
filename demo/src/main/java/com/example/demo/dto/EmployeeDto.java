package com.example.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;

}
