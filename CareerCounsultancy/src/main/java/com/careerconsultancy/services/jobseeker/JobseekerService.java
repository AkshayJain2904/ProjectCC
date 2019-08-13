package com.careerconsultancy.services.jobseeker;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeeker;

public interface JobseekerService {
	void insert(JobSeeker jobSeeker);
	void update(JobSeeker jobSeeker);
	List<JobSeeker> viewAll();
	void delete(JobSeeker jobSeeker);
}
