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

import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
@Repository
public class JobSeekerPersonalDetailsDaoImpl implements JobSeekerPersonalDetailsDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplete;

	@Override
	public void insert(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		hibernateTemplete.save(jobSeekerPersonalDetails);
	}

	@Override
	public void update(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		hibernateTemplete.delete(jobSeekerPersonalDetails);

	}

	@Override
	public void delete(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		hibernateTemplete.delete(jobSeekerPersonalDetails);
	}

	@Override
	public JobSeekerPersonalDetails getById(int id) {
		return hibernateTemplete.get(JobSeekerPersonalDetails.class, id);
	}

	@Override
	public List<JobSeekerPersonalDetails> getAll() {
		return hibernateTemplete.loadAll(JobSeekerPersonalDetails.class);
	}

}
