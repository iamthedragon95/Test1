package com.niit.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.test.dao.RegisterDAO;
import com.niit.test.model.Newuser;



@Service
@Transactional
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	RegisterDAO registerDAO;
	
	

	@Override
	public void s(Newuser newuser) {
		// TODO Auto-generated method stub
		registerDAO.sa(newuser);
	}



	@Override
	public List<Newuser> getallusers(String username) {
		return registerDAO.getallusers(username);
	}

}