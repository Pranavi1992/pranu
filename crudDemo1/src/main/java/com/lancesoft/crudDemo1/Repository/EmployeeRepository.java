package com.lancesoft.crudDemo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lancesoft.crudDemo1.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
