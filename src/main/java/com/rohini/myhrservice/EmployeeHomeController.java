package com.rohini.myhrservice;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/employee_detail")
public class EmployeeHomeController {

private static final String template = "Hello, %s!";
private final AtomicLong counter = new AtomicLong();

@Autowired
private EmployeeRepository employeeRepository;

@Autowired
private ContactRepository contactRepository;

@Autowired
private AddressRepository addressRepository;

@Autowired
private QualificationRepository qualificationRepository;

@Autowired
private SalaryRepository salaryRepository;



@RequestMapping(value="/id", method = RequestMethod.GET)
public EmployeeDetail getEmployeeDetailByEmpId(@RequestParam(value="emp_id", required=false, defaultValue="1") int empId)
{
	EmployeeDetail employeeDetail = new EmployeeDetail();

	Employee emp =  employeeRepository.findOne(empId);
	employeeDetail.setEmployee(emp);

	Contact contact = contactRepository.findByEmpId(empId);
	employeeDetail.setContact(contact);

	Address address = addressRepository.findByEmpId(empId);
	employeeDetail.setAddress(address);
	
	Qualification qualification = qualificationRepository.findByEmpId(empId);
	employeeDetail.setQualification(qualification);
	
	Salary salary = salaryRepository.findByEmpId(empId);
	employeeDetail.setSalary(salary);

	return employeeDetail;
}

@RequestMapping(value="/name", method = RequestMethod.GET)
public @ResponseBody  Employee employeeHome(@RequestParam(value="name", required=false, defaultValue="Stranger") String name)
{
	return employeeRepository.findByFirstName(name);
}



@RequestMapping(value="/All", method = RequestMethod.GET)
public @ResponseBody  List<Employee> employeeAll()
{
	return (List<Employee>) employeeRepository.findAll();
}

@RequestMapping(value="/hello", method = RequestMethod.GET)
public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
}




}