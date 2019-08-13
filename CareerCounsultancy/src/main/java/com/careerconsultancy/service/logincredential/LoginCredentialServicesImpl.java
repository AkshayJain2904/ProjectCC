package com.careerconsultancy.service.logincredential;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.FlashMap;

import com.careerconsultancy.entites.logincredential.LoginCredential;
import com.careerconsultancy.logincredential.dao.LoginCredentialDao;

@Service
@Transactional
public class LoginCredentialServicesImpl implements LoginCredentialService {

	@Autowired
	private LoginCredentialDao loginCredentialDao;
	
	@Override
	public boolean verifyUser(LoginCredential loginCredential) {
		
		LoginCredential loginCredential2= loginCredentialDao.getbyId(loginCredential.getEmailId());
		
		if(loginCredential2.getEmailId().equalsIgnoreCase(loginCredential.getEmailId()) &&
				loginCredential2.getPassword().equals(loginCredential.getPassword()) &&
				loginCredential2.getRole().equalsIgnoreCase(loginCredential.getRole()))
		{
			return true;
		}
		else
		{
			return false;
		} 		
	}
	
	@Override
	public void insertDetails(LoginCredential loginCredential) {
		loginCredentialDao.insert(loginCredential);
	}

	@Override
	public void updateDetails(LoginCredential loginCredential) {
		loginCredentialDao.update(loginCredential);
	}

	@Override
	public void deleteDetails(LoginCredential loginCredential) {
		loginCredentialDao.delete(loginCredential);
	}
}
