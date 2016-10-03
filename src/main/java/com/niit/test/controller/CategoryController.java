package com.niit.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.test.model.Product;
import com.niit.test.service.ProductService;

@Controller
public class CategoryController {
	@Autowired
	private ProductService productservice;
	
	@RequestMapping(value="/Violins")
	public String head(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllViolins());
	  System.out.println(productmodelResult);
		return "Category";
	}
	@RequestMapping(value="/Drums")
	public String Crg(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllDrums());
	  System.out.println(productmodelResult);
		return "Category";
	}
	@RequestMapping(value="/Guitars")
	public String head2(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllGuitars());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value="/WindInstruments")
	public String head3(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllWindInstruments());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value="/Keyboards")
	public String head4(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllKeyboards());
	  System.out.println(productmodelResult);
		return "Category";
}
	@RequestMapping(value="/IndianInstruments")
	public String head5(Map<String, Object> map)
	{
		Product productmodelResult=new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllIndianInstruments());
	  System.out.println(productmodelResult);
		return "Category";	
}}