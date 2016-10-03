package com.niit.test.controller;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.test.model.Product;
import com.niit.test.service.ProductService;



@Controller
public class ProductController {
	@Autowired
	private ServletContext servletContext;
	
	@ModelAttribute("ob")
	public Product construct(){
		return new Product();
	}
	@Autowired
	ProductService productservice;
	@RequestMapping(value={"/viewall","admin/viewall"})
	public String prod1(Map<String, Object>map)
	{
		Product productmodelResult = new Product();
		map.put("productModel",productmodelResult);
	    map.put("productmodelList", productservice.getAllProductModel());
	    
	return "product view";	
	}
	@RequestMapping(value="edit/{id}")
	public String edit(@PathVariable("id")String id,@ModelAttribute Product productModel,Map<String, Object>map)
	{
		
		productModel=productservice.getProductModel(id);
		map.put("productModel",productModel);
		map.put("productmodelList", productservice.getAllProductModel());
	   
	    return "product";
	}
	@RequestMapping(value="delete/{id}")
	public String delete(@PathVariable("id")String id,@ModelAttribute Product productModel,Map<String, Object>map)
	{
		
		productservice.delete(id);
		
	    return "product view";
	}
	
	@RequestMapping(value="/product")
	public String prod()
	{
	return "product";	
	}
	
	@RequestMapping(value={"/productmodel"}, method=RequestMethod.POST)
	public String doActions(@ModelAttribute("ob") Product productModel, BindingResult result, @RequestParam String action, Map<String, Object>map){
		Product productmodelResult = new Product();
	    switch(action.toLowerCase()){
	    case "add":
	    	
	    	if(result.hasErrors()){
	    		return "product";
	    	}
	    	
	    	MultipartFile file= productModel.getFilename();
	    	
	    	if (!file.isEmpty()) {
				try {
					
					// Creating the directory to store file
					//String rootPath = "G:/finally/Music/src/main/webapp/resources/images";
					File rootPath= new File (servletContext.getRealPath("/"));
					File dir = new File(rootPath + File.separator + "resources/admin/upload");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					File serverFile = new File(dir
							+ File.separator + productModel.getImagename()+".jpg");
					System.out.println(serverFile);
					file.transferTo(serverFile);
					
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			
	    	}
	    	productservice.add(productModel);
	    	productmodelResult = productModel;
	    	break;
	    	
	    case "edit":
	    	productservice.edit(productModel);
	    	productmodelResult = productModel;
	    	break;
	    	
	    case "delete":
	    	productservice.delete(productModel.getId());
	    	productmodelResult = new Product();
	    	break;
	    	
	    case "search":
	    	Product searchedProductModel = productservice.getProductModel(productModel.getId());
	    	productmodelResult = searchedProductModel!=null ? searchedProductModel : new Product();
	    	break;
	    }
	 //   map.put("productModel",productmodelResult);
	   // map.put("productmodelList", productservice.getAllProductModel());
	    
		return "product";
	}


}
