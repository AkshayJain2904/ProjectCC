package com.careerconsultancy.services.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.careerconsultancy.entities.jobseeker.JobSeekerEducationalDetails;
import com.careerconsultancy.jobseeker.dao.JobSeekerEducationalDetailsDao;

@Service
@Transactional
public class JobseekerEducationalDetailsServiceImpl implements JobseekerEducationalDetailsService {
	
	@Autowired
	private JobSeekerEducationalDetailsDao jobSeekerEducationalDetailsDao;

	@Override
	public void insert(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		jobSeekerEducationalDetailsDao.insert(jobSeekerEducationalDetails);
	}

	@Override
	public void update(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		jobSeekerEducationalDetailsDao.update(jobSeekerEducationalDetails);

	}

	@Override
	public List<JobSeekerEducationalDetails> viewDetails() {
		return jobSeekerEducationalDetailsDao.getAll();
	}

	@Override
	public void delete(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		jobSeekerEducationalDetailsDao.delete(jobSeekerEducationalDetails);
	}

}
