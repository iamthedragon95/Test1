package com.niit.test.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.test.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
@Autowired
private SessionFactory session;
	
	@Override
	public void add(Product productModel) {
		session.getCurrentSession().save(productModel);
	}

	@Override
	public void edit(Product productModel) {
		session.getCurrentSession().update(productModel);
		
	}

	@Override
	public void delete(String getId) {
		session.getCurrentSession().delete(getProduct(getId));
	}

	@Override
	public Product getProduct(String getId) {
		return (Product)session.getCurrentSession().get(Product.class,getId);
	}

	@Override
	public List getAllProductModel() {
		return session.getCurrentSession().createQuery("from PRODUCTS").list();
	}

	@Override
	public List getAllViolins() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from PRODUCTS where category='VIOLINS'").list();
	}

	@Override
	public List getAllDrums() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from PRODUCTS where category='DRUMS'").list();
	}

	@Override
	public List getAllGuitars() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from PRODUCTS where category='GUITARS'").list();
	}

	@Override
	public List getAllWindInstruments() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from PRODUCTS where category='WINDINSTRUMENTS'").list();
	}

	@Override
	public List getAllKeyboards() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from PRODUCTS where category='KEYBOARDS'").list();
	}

	@Override
	public List getAllIndianInstruments() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from PRODUCTS where category='INDIANINSTRUMENTS'").list();
	}
}
