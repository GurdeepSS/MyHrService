package com.rohini.myhrservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactRepository extends CrudRepository <Contact, Integer>{
	Contact findByEmailAddress(@Param("email_address") String emailAddress);
	Contact findByEmpId(@Param("emp_id") int empId);
}

