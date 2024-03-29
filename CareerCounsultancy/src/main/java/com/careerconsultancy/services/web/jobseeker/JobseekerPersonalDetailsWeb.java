package com.careerconsultancy.services.web.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerconsultancy.entites.logincredential.LoginCredential;
import com.careerconsultancy.entities.job.JobInfo;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
import com.careerconsultancy.service.job.JobInfoService;
import com.careerconsultancy.service.logincredential.LoginCredentialService;
import com.careerconsultancy.services.jobseeker.JobseekerPersonalDetailsService;

@RestController
@RequestMapping("/jobseekerpersonaldetails")
public class JobseekerPersonalDetailsWeb {
	
	@Autowired
	private JobseekerPersonalDetailsService jobseekerPersonalDetailsService;
	
	@Autowired
	private JobInfoService jobInfoService;
	
	

	@PostMapping
	public String insertPersonalDetails(@RequestBody JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		System.out.println(jobSeekerPersonalDetails);
		
		jobseekerPersonalDetailsService.insertPersonalDetails(jobSeekerPersonalDetails);
		return "PersonalDetails inserted";
	}
	
	@PutMapping
	public String updatePersonalDetails(@RequestBody JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		jobseekerPersonalDetailsService.updatePersonalDetails(jobSeekerPersonalDetails);
		return "PersonalDetails updated";
	}
	
	@GetMapping 
	public List<JobSeekerPersonalDetails> viewPersonalDetails() {
		return jobseekerPersonalDetailsService.viewPersonalDetails();
	}
	
	public List<JobInfo> viewAllJobs() {
		return jobInfoService.viewAllJob();
	}
}
