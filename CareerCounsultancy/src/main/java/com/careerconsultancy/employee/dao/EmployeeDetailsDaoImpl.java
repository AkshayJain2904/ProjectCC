package com.careerconsultancy.employee.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.careerconsultancy.entities.employee.EmployeeDetails;


@Repository
public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public EmployeeDetailsDaoImpl() {
		super();
		
	}

	@Override
	public void insert(EmployeeDetails employeeDetails) {
		hibernateTemplate.save(employeeDetails);
	}

	@Override
	public void delete(EmployeeDetails employeeDetails) {
		hibernateTemplate.delete(employeeDetails);

	}

	@Override
	public void update(EmployeeDetails employeeDetails) {
		hibernateTemplate.update(employeeDetails);
	}

	@Override
	public EmployeeDetails getbyId(int id) {
		return hibernateTemplate.get(EmployeeDetails.class, id);
	}

	@Override
	public List<EmployeeDetails> getAll() {
		return hibernateTemplate.loadAll(EmployeeDetails.class);
	}

}
