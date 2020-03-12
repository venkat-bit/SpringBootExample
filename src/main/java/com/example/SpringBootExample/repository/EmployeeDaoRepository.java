package com.example.SpringBootExample.repository;

import com.example.SpringBootExample.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDaoRepository extends JpaRepository<Employee,Long> {
}
