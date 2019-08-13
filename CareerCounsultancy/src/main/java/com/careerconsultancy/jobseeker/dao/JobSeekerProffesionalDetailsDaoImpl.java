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
import com.careerconsultancy.entities.jobseeker.JobSeekerProffesionalDetails;
@Repository
public class JobSeekerProffesionalDetailsDaoImpl implements JobSeekerProffesionalDetailsDao {
	@Autowired
	private HibernateTemplate hibernateTemplete;

	@Override
	public void insert(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		hibernateTemplete.save(jobSeekerProffesionalDetails);
	}

	@Override
	public void delete(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		hibernateTemplete.delete(jobSeekerProffesionalDetails);
	}

	@Override
	public void update(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		hibernateTemplete.update(jobSeekerProffesionalDetails);
	}

	@Override
	public JobSeekerProffesionalDetails getbyId(int id) {
		return hibernateTemplete.get(JobSeekerProffesionalDetails.class, id);
	}

	@Override
	public List<JobSeekerProffesionalDetails> getAll() {
		return hibernateTemplete.loadAll(JobSeekerProffesionalDetails.class);
	}

}
