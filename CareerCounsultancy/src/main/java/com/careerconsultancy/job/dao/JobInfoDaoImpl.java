package com.careerconsultancy.job.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.careerconsultancy.entities.job.JobInfo;
import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;

@Repository
public class JobInfoDaoImpl implements JobInfoDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insert(JobInfo jobInfo) {
		hibernateTemplate.save(jobInfo);
	}

	@Override
	public void delete(JobInfo jobInfo) {
		hibernateTemplate.delete(jobInfo);
	}

	@Override
	public void update(JobInfo jobInfo) {
		hibernateTemplate.update(jobInfo);
	}

	@Override
	public JobInfo getbyId(int id) {
		return hibernateTemplate.get(JobInfo.class, id);
	}

	@Override
	public List<JobInfo> getAll() {
		return hibernateTemplate.loadAll(JobInfo.class);
	}

}
