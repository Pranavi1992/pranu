package com.lancesoft.crudDemo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lancesoft.crudDemo1.Entity.Employee;
import com.lancesoft.crudDemo1.Repository.EmployeeRepository;
import com.lancesoft.crudDemo1.Service.EmployeeServiceInterface;

@RestController
@RequestMapping("/emp")  

public class EmployeeController {
	
	
	/*//for finding all
	 * @Autowired
	EmployeeRepository empRepo;
@GetMapping
public List<Employee> getAllEmployees()
{
System.out.println("getting all employees");
return empRepo.findAll();
}*/
	
	
	@Autowired
	private EmployeeServiceInterface empSerIn;
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee  employee)
	{
		Employee employeeSaved=empSerIn.addEmployee(employee);
	return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
	}
	
	//retrive
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
	List<Employee> allEmployees=empSerIn.getAllEmployees();
	return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	}
	//byid
	@GetMapping("/employee/{empid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable("empid") Long empidL)
	{
		Employee employeeRetrived=empSerIn.getEmpById(empidL);
	return new ResponseEntity<Employee>(employeeRetrived,HttpStatus.OK);
	}
	//Delete BY ID
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteByName(@PathVariable("empid") Long empidL )
	{
		empSerIn.deleteById(empidL);
	return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee  employee)
	{
		Employee employeeSaved=empSerIn.addEmployee(employee);
	return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
	}
}
