package com.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee getByName(String name);

    Employee findByName(String name);
}
