package com.careerconsultancy.services.jobseeker;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;

public interface JobseekerAddressService {
	void insertAddress(JobSeekerAddress jobSeekerAddress);
	void updateAddress(JobSeekerAddress jobSeekerAddress);
	List<JobSeekerAddress> viewAddresses();
	void delete(JobSeekerAddress jobSeekerAddress);
}