package com.careerconsultancy.services.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.careerconsultancy.entities.jobseeker.JobSeekerProffesionalDetails;
import com.careerconsultancy.jobseeker.dao.JobSeekerProffesionalDetailsDao;

@Service
@Transactional
public class JobseekerProffesionalDetailsServiceImpl implements JobseekerProffesionalDetailsService {
	
	@Autowired
	private JobSeekerProffesionalDetailsDao jobSeekerProffesionalDetailsDao;

	@Override
	public void insert(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		jobSeekerProffesionalDetailsDao.insert(jobSeekerProffesionalDetails);
	}

	@Override
	public void update(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		jobSeekerProffesionalDetailsDao.update(jobSeekerProffesionalDetails);
	}

	@Override
	public List<JobSeekerProffesionalDetails> viewAll() {
		return jobSeekerProffesionalDetailsDao.getAll();
	}

	@Override
	public void delete(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		jobSeekerProffesionalDetailsDao.delete(jobSeekerProffesionalDetails);
	}

}
