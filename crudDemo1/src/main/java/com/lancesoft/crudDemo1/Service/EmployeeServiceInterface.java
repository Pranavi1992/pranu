package com.lancesoft.crudDemo1.Service;

import java.util.List;

import com.lancesoft.crudDemo1.Entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public  List<Employee> getAllEmployees();

	public Employee getEmpById(Long empidL);

	public void deleteById(Long empidL);



	

}
