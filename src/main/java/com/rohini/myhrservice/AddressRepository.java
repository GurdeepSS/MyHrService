package com.rohini.myhrservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public interface AddressRepository extends CrudRepository <Address, Integer>{
	Address findByCity(@Param("city") String city);
	Address findByEmpId(@Param("emp_id") int empId);
}

