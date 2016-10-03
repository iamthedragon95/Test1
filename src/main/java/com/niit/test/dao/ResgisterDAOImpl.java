package com.niit.test.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.test.model.Newuser;

import com.niit.test.model.Userroles;

@Repository
@Transactional
public class ResgisterDAOImpl implements RegisterDAO{
	

	@Autowired(required=true)
	private SessionFactory sf;
	

	/*@Transactional
	public List<Newuser> list() {
		@SuppressWarnings("unchecked")
		List<Newuser> listProduct = (List<Newuser>) sf.getCurrentSession().createCriteria(Newuser.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;

	}*/
	@Override
	public void sa(Newuser newuser){
	newuser.setEnable(true);
	Userroles r=new Userroles();
	r.setNewuser(newuser);
	r.setRole("ROLE_USER");
		sf.getCurrentSession().saveOrUpdate(newuser);	
		sf.getCurrentSession().saveOrUpdate(r);}


	@Override
	public List<Newuser> getallusers(String username) {
		// TODO Auto-generated method stub
		return (List<Newuser>) sf.getCurrentSession().createQuery("from USER where USERNAME='"+username+"'").list();
	}


	/*@Override
	public void sa(RegistrationBean userRegis) {
		// TODO Auto-generated method stub
		
	}*/

}