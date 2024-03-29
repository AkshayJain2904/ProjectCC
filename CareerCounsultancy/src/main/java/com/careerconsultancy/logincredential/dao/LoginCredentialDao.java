package com.careerconsultancy.logincredential.dao;

import java.util.List;

import com.careerconsultancy.entites.logincredential.LoginCredential;

public interface LoginCredentialDao {
	void insert(LoginCredential loginCredential);
	void delete(LoginCredential loginCredential);
	void update(LoginCredential loginCredential);
	LoginCredential getbyId(String id);
	List<LoginCredential> getAll();

}
