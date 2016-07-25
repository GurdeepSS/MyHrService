package com.rohini.myhrservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "qualifications", path = "qualifications")
public interface QualificationRepository extends CrudRepository <Qualification, Integer>{
	Qualification findByEmpId(@Param("emp_id") int empId);
}

