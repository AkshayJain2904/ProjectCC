package com.careerconsultancy.services.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;
import com.careerconsultancy.jobseeker.dao.JobSeekerAddressDao;


@Service
@Transactional
public class JobseekerAddressServiceImpl implements JobseekerAddressService {

	@Autowired
	private JobSeekerAddressDao jobSeekerAddressDao;
	
	@Override
	public void insertAddress(JobSeekerAddress jobSeekerAddress) {
		jobSeekerAddressDao.insert(jobSeekerAddress);
	}

	@Override
	public void updateAddress(JobSeekerAddress jobSeekerAddress) {
		jobSeekerAddressDao.update(jobSeekerAddress);
	}

	@Override
	public List<JobSeekerAddress> viewAddresses() {
		return jobSeekerAddressDao.getAll();
	}

	@Override
	public void delete(JobSeekerAddress jobSeekerAddress) {
		jobSeekerAddressDao.delete(jobSeekerAddress);
		
	}

}
