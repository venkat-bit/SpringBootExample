package com.example.SpringBootExample.controller;

import com.example.SpringBootExample.domain.Employee;
import com.example.SpringBootExample.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    //getemployee....
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/findEmployee/{empId}")
    public Employee findEmployee(@PathVariable Long empId) {
        return employeeService.findEmployee(empId);
    }

    @PostMapping("/createEmployee")
    public List<Employee> insertEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public List<Employee> updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee")
    public List<Employee> deleteEmployee(@RequestBody Employee employee) {
        return employeeService.deleteEmployee(employee);
    }
}
