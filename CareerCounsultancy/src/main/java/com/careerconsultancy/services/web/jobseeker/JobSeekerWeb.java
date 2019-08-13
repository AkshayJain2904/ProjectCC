package com.careerconsultancy.services.web.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerconsultancy.entities.jobseeker.JobSeeker;
import com.careerconsultancy.services.jobseeker.JobseekerService;



@RestController
@RequestMapping("/jobseeker")
public class JobSeekerWeb {

	@Autowired
	private JobseekerService jobseekerService;
	
	@PostMapping
	public String insertJobSeeker(@RequestBody JobSeeker jobSeeker) {
		jobseekerService.insert(jobSeeker);
		return "record inserted";
	}
	
	@PutMapping
	public String updateJobseeker(@RequestBody JobSeeker jobSeeker) {
		jobseekerService.update(jobSeeker);
		return "record updated";
	}
	
	@GetMapping
	public List<JobSeeker> viewJobseeker() {
		return jobseekerService.viewAll();
		
	}
}