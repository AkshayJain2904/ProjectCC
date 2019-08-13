package com.careerconsultancy.services.web.jobseeker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerconsultancy.entities.jobseeker.JobSeekerEducationalDetails;
import com.careerconsultancy.services.jobseeker.JobseekerEducationalDetailsService;

@RestController
@RequestMapping("/jobseekereducationaldetailsweb")
public class JobseekerEducationalDetailsWeb {
	
	@Autowired
	private JobseekerEducationalDetailsService jobseekerEducationalDetailsService;
	
	@PostMapping
	public String insertEducationalDetails(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		jobseekerEducationalDetailsService.insert(jobSeekerEducationalDetails);
		return "record inserted";
	}
	
	@PutMapping
	public String updateEducationalDetails(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		jobseekerEducationalDetailsService.update(jobSeekerEducationalDetails);
		return "record updated";
	}
	
	public void viewEducationalDetails() {
		jobseekerEducationalDetailsService.viewDetails();
	}

}
