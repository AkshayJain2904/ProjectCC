package com.careerconsultancy.service.employee;

import java.util.List;

import com.careerconsultancy.entities.employee.EmployeeDetails;
import com.careerconsultancy.entities.jobseeker.JobSeeker;

public interface EmployeeService {
	void createEmployee(EmployeeDetails employeeDetails);
	void deleteEmployee(EmployeeDetails employeeDetails);
	void updateEmployee(EmployeeDetails employeeDetails);
	List<EmployeeDetails> viewAllEmployee();
}
