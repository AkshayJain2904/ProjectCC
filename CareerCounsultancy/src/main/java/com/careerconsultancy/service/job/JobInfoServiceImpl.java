package com.careerconsultancy.service.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.careerconsultancy.entities.job.JobInfo;
import com.careerconsultancy.job.dao.JobInfoDao;

@Service
@Transactional
public class JobInfoServiceImpl implements JobInfoService {
	
	@Autowired
	private JobInfoDao jobInfoDao;

	@Override
	public void postJob(JobInfo jobInfo) {
		jobInfoDao.insert(jobInfo);
	}

	@Override
	public List<JobInfo> viewAllJob() {		
		return jobInfoDao.getAll();
	}

	@Override
	public void editJob(JobInfo jobInfo) {
		jobInfoDao.update(jobInfo);
	}

	@Override
	public void deleteJob(JobInfo jobInfo) {
		jobInfoDao.delete(jobInfo);
	}

}