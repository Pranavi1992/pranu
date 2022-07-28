package com.lancesoft.crudDemo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lancesoft.crudDemo1.Entity.Employee;
import com.lancesoft.crudDemo1.Repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {
@Autowired
private EmployeeRepository empRepo;
	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee=empRepo.save(employee);
		return savedEmployee;
	}
	@Override
	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}
	@Override
	public Employee getEmpById(Long empidL) {
		// TODO Auto-generated method stub
		return empRepo.findById(empidL).get();
	}
	@Override
	public void deleteById(Long empidL) {
		// TODO Auto-generated method stub
		empRepo.deleteById(empidL);
	}

	}


