package com.niit.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.test.dao.ProductDao;
import com.niit.test.model.Product;
@Service
@Transactional
public class ProductServiceImpl  implements ProductService{
@Autowired(required=true)
private ProductDao productdao;

@Override	
public void add(Product productModel){
	productdao.add(productModel);
	
}
@Override	
public void edit(Product productModel){
	productdao.edit(productModel);
	
}
@Override	
public void delete(String getId){
	productdao.delete(getId);
	
}
@Override
public Product getProductModel(String getId){
	return productdao.getProduct(getId);
}
@Override
public List getAllProductModel(){
	return productdao.getAllProductModel();
}

@Override
public List getAllViolins() {
	
	return productdao.getAllViolins();
}

@Override
public List getAllDrums() {
	
	return productdao.getAllDrums();
}

@Override
public List getAllGuitars() {
	
	return productdao.getAllGuitars();
}

@Override
public List getAllWindInstruments() {

	return productdao.getAllWindInstruments();
}

@Override
public List getAllKeyboards() {

	return productdao.getAllKeyboards();
}

@Override
public List getAllIndianInstruments() {

	return productdao.getAllIndianInstruments();
}

}
