package com.careerconsultancy.services.jobseeker;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;

public interface JobseekerPersonalDetailsService {
	void insertPersonalDetails(JobSeekerPersonalDetails jobSeekerPersonalDetails);
	List<JobSeekerPersonalDetails> viewPersonalDetails();
	void updatePersonalDetails(JobSeekerPersonalDetails jobSeekerPersonalDetails);
	void deletePersonalDetails(JobSeekerPersonalDetails jobSeekerPersonalDetails);
}
