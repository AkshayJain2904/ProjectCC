package com.careerconsultancy.service.web.logincredential;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerconsultancy.entites.logincredential.LoginCredential;
import com.careerconsultancy.service.logincredential.LoginCredentialService;

@RestController
@RequestMapping("/login")
public class LoginCredentialWeb {
	
	@Autowired
	private LoginCredentialService loginCredentialService;
	
	@PostMapping
	public LoginCredential logIn(@RequestBody LoginCredential loginCredential) {
		boolean value=loginCredentialService.verifyUser(loginCredential);
		if(value==true)
		{
			return loginCredential;
		}
		else {
			return null;
		}
	}
}
