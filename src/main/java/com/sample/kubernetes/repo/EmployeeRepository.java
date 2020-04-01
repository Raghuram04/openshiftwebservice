package com.sample.kubernetes.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sample.kubernetes.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	public Employee findByEmployeeid(Integer employeeid);

	public Employee findByName(String name);

}
