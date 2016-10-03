package com.niit.test.dao;

import java.util.List;

import com.niit.test.model.Newuser;

public interface RegisterDAO {

 public void sa(Newuser newuser);

public List<Newuser> getallusers(String username);

}
