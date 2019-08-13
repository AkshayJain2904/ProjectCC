package com.careerconsultancy.entities.jobseeker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "JobSeeker")
public class JobSeeker {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jsId;
	 
	@OneToOne
	private JobSeekerPersonalDetails jobSeekerPersonalDetails;
	

	@OneToOne
	private JobSeekerEducationalDetails jobSeekerEducationalDetails;
	

	@OneToOne
	private JobSeekerAddress jobSeekerAddress;
	

	@OneToOne
	private JobSeekerProffesionalDetails jobSeekerProffesionalDetails;

	public JobSeekerPersonalDetails getJobSeekerPersonalDetails() {
		return jobSeekerPersonalDetails;
	}

	public void setJobSeekerPersonalDetails(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		this.jobSeekerPersonalDetails = jobSeekerPersonalDetails;
	}

	public JobSeekerEducationalDetails getJobSeekerEducationalDetails() {
		return jobSeekerEducationalDetails;
	}

	public void setJobSeekerEducationalDetails(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		this.jobSeekerEducationalDetails = jobSeekerEducationalDetails;
	}

	public JobSeekerAddress getJobSeekerAddress() {
		return jobSeekerAddress;
	}

	public void setJobSeekerAddress(JobSeekerAddress jobSeekerAddress) {
		this.jobSeekerAddress = jobSeekerAddress;
	}

	public JobSeekerProffesionalDetails getJobSeekerProffesionalDetails() {
		return jobSeekerProffesionalDetails;
	}

	public void setJobSeekerProffesionalDetails(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		this.jobSeekerProffesionalDetails = jobSeekerProffesionalDetails;
	}
	
	

}
