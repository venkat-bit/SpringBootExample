package com.example.SpringBootExample.service;

import com.example.SpringBootExample.domain.Employee;
import java.util.List;

public interface EmployeeServiceInterface {

    public List<Employee> getEmployees();
    public Employee findEmployee(Long empId);
    public List<Employee> insertEmployee(Employee employee);
    public List<Employee> updateEmployee(Employee employee);
    public List<Employee> deleteEmployee(Employee employee);
}
