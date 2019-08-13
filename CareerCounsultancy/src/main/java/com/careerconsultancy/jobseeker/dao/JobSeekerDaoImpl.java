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

import com.careerconsultancy.entities.jobseeker.JobSeeker;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
@Repository
public class JobSeekerDaoImpl implements JobSeekerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public JobSeekerDaoImpl() {
		super();
		
	}

	@Override
	public void insert(JobSeeker jobSeeker) {
		hibernateTemplate.save(jobSeeker);
	}

	@Override
	public void delete(JobSeeker jobSeeker) {
		hibernateTemplate.delete(jobSeeker);

	}

	@Override
	public void update(JobSeeker jobSeeker) {
		hibernateTemplate.update(jobSeeker);
	}

	@Override
	public JobSeeker getbyId(int id) {
		return hibernateTemplate.get(JobSeeker.class, id);
	}

	@Override
	public List<JobSeeker> getAll() {
		return hibernateTemplate.loadAll(JobSeeker.class);
	}

}
