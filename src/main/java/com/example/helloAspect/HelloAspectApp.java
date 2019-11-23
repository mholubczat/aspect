package com.example.helloAspect;

import com.example.helloAspect.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloAspectApp implements CommandLineRunner {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(HelloAspectApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(employeeService.getEmployee().getName());
		employeeService.getEmployee().setName("NewName");
		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().throwException();


	}
}
