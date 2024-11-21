package com.bridgelabz.springexample.service;

import com.bridgelabz.springexample.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(long id);


    Employee updateEmployee(long id, Employee employee);

    void deleteEmployee(long id);
}
