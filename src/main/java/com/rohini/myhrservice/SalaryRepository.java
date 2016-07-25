package com.rohini.myhrservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "salaries", path = "salaries")
public interface SalaryRepository extends CrudRepository <Salary, Integer>{
	Salary findByEmpId(@Param("emp_id") int empId);
}

