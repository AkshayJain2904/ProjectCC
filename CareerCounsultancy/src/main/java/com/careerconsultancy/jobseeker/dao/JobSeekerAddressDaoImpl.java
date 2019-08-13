package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
@Repository
public class JobSeekerAddressDaoImpl implements JobSeekerAddressDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public JobSeekerAddressDaoImpl() {
		super();
	
	}

	@Override
	public void insert(JobSeekerAddress jobSeekerAddress) {
		hibernateTemplate.save(jobSeekerAddress);
	}

	@Override
	public void delete(JobSeekerAddress jobSeekerAddress) {
		hibernateTemplate.delete(jobSeekerAddress);

	}

	@Override
	public void update(JobSeekerAddress jobSeekerAddress) {
		hibernateTemplate.update(jobSeekerAddress);
	}

	@Override
	public JobSeekerAddress getbyId(int id) {
		return hibernateTemplate.get(JobSeekerAddress.class, id);
	}

	@Override
	public List<JobSeekerAddress> getAll() {
		return hibernateTemplate.loadAll(JobSeekerAddress.class);
	}

}
