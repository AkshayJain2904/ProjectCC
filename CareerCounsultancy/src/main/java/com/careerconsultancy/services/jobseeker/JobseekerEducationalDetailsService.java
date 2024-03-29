package com.careerconsultancy.services.jobseeker;

import java.util.List;

import com.careerconsultancy.entities.jobseeker.JobSeekerEducationalDetails;

public interface JobseekerEducationalDetailsService {
	void insert(JobSeekerEducationalDetails jobSeekerEducationalDetails);
	void update(JobSeekerEducationalDetails jobSeekerEducationalDetails);
	List<JobSeekerEducationalDetails> viewDetails();
	void delete(JobSeekerEducationalDetails jobSeekerEducationalDetails);
}
