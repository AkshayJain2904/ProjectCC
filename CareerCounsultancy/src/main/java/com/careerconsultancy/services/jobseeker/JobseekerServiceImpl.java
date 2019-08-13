package com.careerconsultancy.services.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.careerconsultancy.entities.jobseeker.JobSeeker;
import com.careerconsultancy.jobseeker.dao.JobSeekerDao;
import com.careerconsultancy.jobseeker.dao.JobSeekerEducationalDetailsDao;

@Service
@Transactional
public class JobseekerServiceImpl implements JobseekerService {

	@Autowired
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	private JobseekerEducationalDetailsService jobseekerEducationalDetailsService;
	
	@Autowired
	private JobseekerProffesionalDetailsService jobseekerProffesionalDetailsService;
	
	@Autowired
	private JobseekerPersonalDetailsService jobseekerPersonalDetailsService;
	
	@Autowired
	private JobseekerAddressService jobseekerAddressService;
	
	@Override
	public void insert(JobSeeker jobSeeker) {
		jobseekerPersonalDetailsService.insertPersonalDetails(jobSeeker.getJobSeekerPersonalDetails());
		jobseekerAddressService.insertAddress(jobSeeker.getJobSeekerAddress());
		jobseekerProffesionalDetailsService.insert(jobSeeker.getJobSeekerProffesionalDetails());
		jobseekerEducationalDetailsService.insert(jobSeeker.getJobSeekerEducationalDetails());		
		jobSeekerDao.insert(jobSeeker);
		System.out.println("record inserted");
	}
	@Override
	public void update(JobSeeker jobSeeker) {
		jobseekerPersonalDetailsService.updatePersonalDetails(jobSeeker.getJobSeekerPersonalDetails());
		jobseekerEducationalDetailsService.update(jobSeeker.getJobSeekerEducationalDetails());
		jobseekerProffesionalDetailsService.update(jobSeeker.getJobSeekerProffesionalDetails());
		jobseekerAddressService.updateAddress(jobSeeker.getJobSeekerAddress());
		jobSeekerDao.update(jobSeeker);
	}

	@Override
	public List<JobSeeker> viewAll() {
		return jobSeekerDao.getAll();
	}
	@Override
	public void delete(JobSeeker jobSeeker) {
		jobseekerPersonalDetailsService.deletePersonalDetails(jobSeeker.getJobSeekerPersonalDetails());
		jobseekerEducationalDetailsService.delete(jobSeeker.getJobSeekerEducationalDetails());
		jobseekerAddressService.delete(jobSeeker.getJobSeekerAddress());
		jobseekerProffesionalDetailsService.delete(jobSeeker.getJobSeekerProffesionalDetails());
		jobSeekerDao.delete(jobSeeker);
	}
	
}
