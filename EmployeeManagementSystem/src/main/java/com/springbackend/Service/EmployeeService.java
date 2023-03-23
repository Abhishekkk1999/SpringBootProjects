package com.springbackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springbackend.Model.Employee;
import com.springbackend.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
//	public Employee saveEmployee(List<Employee> employees) {
//        return employeeRepository.save(employees);
//    }
	
	public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public String deleteEmployee(int id) {
    	employeeRepository.deleteById(id);
        return "Employee removed with id : " + id;
    }

    public Employee updateEmployee(Employee employee,int id) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

	
	

}
