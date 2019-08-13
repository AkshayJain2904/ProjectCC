package com.careerconsultancy.job.dao;

import java.util.List;

import com.careerconsultancy.entities.job.JobInfo;

public interface JobInfoDao {
	void insert(JobInfo jobInfo);
	void delete(JobInfo jobInfo);
	void update(JobInfo jobInfo);
	JobInfo getbyId(int id);
	List<JobInfo> getAll();

}
