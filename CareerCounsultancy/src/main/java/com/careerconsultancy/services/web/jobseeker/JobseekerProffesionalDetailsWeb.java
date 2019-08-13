package com.careerconsultancy.services.web.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerconsultancy.entities.jobseeker.JobSeekerProffesionalDetails;
import com.careerconsultancy.services.jobseeker.JobseekerProffesionalDetailsService;

@RestController
@RequestMapping("/jobseekerproffesionaldetailsweb")
public class JobseekerProffesionalDetailsWeb {

	@Autowired
	private JobseekerProffesionalDetailsService jobseekerProffesionalDetailsService;
	
	@PostMapping
	public String insertProffesionalDetails(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		jobseekerProffesionalDetailsService.insert(jobSeekerProffesionalDetails);
		return "record inserted";
	}
	
	@PutMapping
	public String nameProffesionalDetails(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		jobseekerProffesionalDetailsService.update(jobSeekerProffesionalDetails);
		return "record updated";
	}
	
	@GetMapping
	public List<JobSeekerProffesionalDetails> viewProffesionalDetails() {
		return jobseekerProffesionalDetailsService.viewAll();
	}
}
