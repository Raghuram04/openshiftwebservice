package com.sample.kubernetes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.kubernetes.model.Employee;
import com.sample.kubernetes.repo.EmployeeRepository;

@RestController
@RequestMapping("/company")
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;

	@RequestMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable Integer employeeId) {
		System.out.println("Employee Id" + employeeId);
		// Employee emp = empRepo.findByEmployeeid(employeeId);
		Employee emp = empRepo.findByName("Yalini");
		System.out.println("Response" + emp);
		return emp;
	}
}
