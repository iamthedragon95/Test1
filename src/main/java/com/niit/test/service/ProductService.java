package com.niit.test.service;

import java.util.List;

import com.niit.test.model.Product;

public interface ProductService {
	
	public void add(Product productModel);
	public void edit(Product productModel);
	public void delete(String Id);
	public Product getProductModel(String getId);
	public List getAllProductModel();

	
	public List getAllViolins();
	public List getAllDrums();
	public List getAllGuitars();
	public List getAllWindInstruments();
	public List getAllKeyboards();
	public List getAllIndianInstruments();
	
}
