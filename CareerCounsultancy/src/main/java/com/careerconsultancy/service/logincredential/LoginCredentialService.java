package com.careerconsultancy.service.logincredential;

import com.careerconsultancy.entites.logincredential.LoginCredential;

public interface LoginCredentialService {
	boolean verifyUser(LoginCredential loginCredential);
	void insertDetails(LoginCredential loginCredential);
	void updateDetails(LoginCredential loginCredential);
	void deleteDetails(LoginCredential loginCredential);
}
