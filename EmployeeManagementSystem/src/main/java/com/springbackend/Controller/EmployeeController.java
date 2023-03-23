package com.springbackend.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbackend.Model.Employee;
import com.springbackend.Service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/get")
	public List<Employee> employees(){
		return employeeService.getEmployees();
	}
	

	   @PostMapping("/addEmployee")
	    public Boolean addEmployee(@RequestBody Employee employee) {
		    employeeService.saveEmployee(employee);
		    
		    return true;
		   }
	   
	   @PostMapping("/addEmployees")
	   public List<Employee> addEmployees(@RequestBody List <Employee> employees){
		 return employeeService.saveEmployees(employees);
	   }
	   
	   @PutMapping("/updateEmployees/{Employeeid}")
	   public Employee updateEmployee(@RequestBody Employee employees, @PathVariable("Employeeid") int Employeeid){
		return employeeService.updateEmployee(employees,Employeeid);
		   
	   }
	   @DeleteMapping("/delete/{id}")
	    public String deleteEmployee(@PathVariable int id) {
	        return employeeService.deleteEmployee(id);
	    }
	   //update employee rest api
	 


	
	
}
