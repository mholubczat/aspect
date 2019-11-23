package com.example.helloAspect.services;


import com.example.helloAspect.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
