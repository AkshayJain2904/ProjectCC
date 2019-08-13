package com.careerconsultancy.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.careerconsultancy.employee.dao.EmployeeDetailsDao;
import com.careerconsultancy.entites.logincredential.LoginCredential;
import com.careerconsultancy.entities.employee.EmployeeDetails;
import com.careerconsultancy.service.logincredential.LoginCredentialService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDetailsDao employeeDetailsDao;
	
	@Autowired
	private LoginCredentialService loginCredentialService;

	@Override
	public void createEmployee(EmployeeDetails employeeDetails) {
		String role="employee";
		LoginCredential loginCredential=new LoginCredential();
		loginCredential.setEmailId(employeeDetails.getEmpEmail());
		loginCredential.setPassword(employeeDetails.getEmpPassword());
		loginCredential.setRole(role);
		loginCredentialService.insertDetails(loginCredential);
		employeeDetailsDao.insert(employeeDetails);
	}

	@Override
	public void deleteEmployee(EmployeeDetails employeeDetails) {
		LoginCredential loginCredential=new LoginCredential();
		loginCredential.setEmailId(employeeDetails.getEmpEmail());
		loginCredential.setPassword(employeeDetails.getEmpPassword());
		loginCredentialService.deleteDetails(loginCredential);
		employeeDetailsDao.delete(employeeDetails);
	}

	@Override
	public void updateEmployee(EmployeeDetails employeeDetails) {
		employeeDetailsDao.update(employeeDetails);
	}

	@Override
	public List<EmployeeDetails> viewAllEmployee() {
		return employeeDetailsDao.getAll();
	}
}
