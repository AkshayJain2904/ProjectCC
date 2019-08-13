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

import com.careerconsultancy.entities.jobseeker.JobSeekerEducationalDetails;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
@Repository
public class JobSeekerEducationalDetailsDaoImpl implements JobSeekerEducationalDetailsDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplete;
	
	
	@Override
	public void insert(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		hibernateTemplete.save(jobSeekerEducationalDetails);
	}

	@Override
	public void delete(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		hibernateTemplete.delete(jobSeekerEducationalDetails);
	}

	@Override
	public void update(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		hibernateTemplete.update(jobSeekerEducationalDetails);
	}

	@Override
	public JobSeekerEducationalDetails getbyId(int id) {
		return hibernateTemplete.get(JobSeekerEducationalDetails.class, id);
	}

	@Override
	public List<JobSeekerEducationalDetails> getAll() {
		return hibernateTemplete.loadAll(JobSeekerEducationalDetails.class);
	}

}
