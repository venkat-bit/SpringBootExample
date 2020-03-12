package com.example.SpringBootExample.service;

import com.example.SpringBootExample.domain.Employee;
import com.example.SpringBootExample.repository.EmployeeDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    @Autowired
    EmployeeDaoRepository employeeDaoRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeDaoRepository.findAll();
    }

    @Override
    public Employee findEmployee(Long empId) {
        return employeeDaoRepository.findById(empId).orElse(null);
    }

    @Override
    public List<Employee> insertEmployee(Employee employee) {
        employeeDaoRepository.save(employee);
        return employeeDaoRepository.findAll();
    }

    @Override
    public List<Employee> updateEmployee(Employee employee) {
        employeeDaoRepository.save(employee);
        return employeeDaoRepository.findAll();
    }

    @Override
    public List<Employee> deleteEmployee(Employee employee) {
        employeeDaoRepository.delete(employee);
        return employeeDaoRepository.findAll();
    }
}
