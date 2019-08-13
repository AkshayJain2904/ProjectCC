package com.careerconsultancy.logincredential.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.careerconsultancy.entites.logincredential.LoginCredential;


@Repository
public class LoginCredentialDaoImpl implements LoginCredentialDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insert(LoginCredential loginCredential) {
		hibernateTemplate.save(loginCredential);
	}

	@Override
	public void delete(LoginCredential loginCredential) {
		hibernateTemplate.delete(loginCredential);
	}

	@Override
	public void update(LoginCredential loginCredential) {
		hibernateTemplate.update(loginCredential);
	}

	@Override
	public LoginCredential getbyId(String id) {
		return hibernateTemplate.get(LoginCredential.class, id);
	} 

	@Override
	public List<LoginCredential> getAll() {
		return hibernateTemplate.loadAll(LoginCredential.class);
	}

}
