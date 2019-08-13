package com.careerconsultancy.service.job;

import java.util.List;

import com.careerconsultancy.entities.job.JobInfo;

public interface JobInfoService {
	void postJob(JobInfo jobInfo);
	List<JobInfo> viewAllJob();
	void editJob(JobInfo jobInfo);
	void deleteJob(JobInfo jobInfo);
}
