package com.careerconsultancy.services.web.jobseeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;
import com.careerconsultancy.services.jobseeker.JobseekerAddressService;

@RestController
@RequestMapping("/jobseekeraddress")
public class JobseekerAddressWeb {

	@Autowired
	private JobseekerAddressService jobseekerAddressService;
	
	@PostMapping
	public String insertJobseekerAddress(JobSeekerAddress jobSeekerAddress) {
		jobseekerAddressService.insertAddress(jobSeekerAddress);
		return "address inserted";
	}
	
	@PutMapping
	public String updateJobseekerAddress(JobSeekerAddress jobSeekerAddress)
	{
		jobseekerAddressService.updateAddress(jobSeekerAddress);
		return "address updated";
	}
	
	@GetMapping
	public List<JobSeekerAddress> viewJobseekerAddress() {
		return jobseekerAddressService.viewAddresses();
	}
}
