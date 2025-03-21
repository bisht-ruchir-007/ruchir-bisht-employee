package com.app.interview.controller;


import com.app.interview.dto.EmployeeAddressDTO;
import com.app.interview.entity.Employee;
import com.app.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hi")
    public String defaultRoute() {
        return "Server is up";
    }

    @GetMapping("/employees")
    public List<EmployeeAddressDTO> getEmployeesWithMaxPriorityAddress() {
        return employeeService.getEmployeesWithMaxPriorityAddress();
    }

}


