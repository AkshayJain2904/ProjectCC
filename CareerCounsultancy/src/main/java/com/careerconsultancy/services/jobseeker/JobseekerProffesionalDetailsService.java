package com.careerconsultancy.services.jobseeker;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerProffesionalDetails;

public interface JobseekerProffesionalDetailsService {
	void insert(JobSeekerProffesionalDetails jobSeekerProffesionalDetails);
	void update(JobSeekerProffesionalDetails jobSeekerProffesionalDetails);
	List<JobSeekerProffesionalDetails> viewAll();
	void delete(JobSeekerProffesionalDetails jobSeekerProffesionalDetails);
}
