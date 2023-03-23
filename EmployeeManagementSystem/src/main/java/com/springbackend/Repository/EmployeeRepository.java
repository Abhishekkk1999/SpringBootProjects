package com.springbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbackend.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findByName(String Name);

}
