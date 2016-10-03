
package com.niit.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity(name="PRODUCTS")
@Component
public class Product {
	@NotNull(message="Description cannot be empty")
	private String description;
	@NotNull(message="Description cannot be empty")
	private double price;
	@NotNull(message="Description cannot be empty")
	private String category;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@NotNull(message="Description cannot be empty")
	private String name;
	@NotNull
	private Integer quantity;
	@Transient
	private MultipartFile filename;
	
	@NotNull(message="Description cannot be empty")
	private String imagename;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile getFilename() {
		return filename;
	}

	public void setFilename(MultipartFile filename) {
		this.filename = filename;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
		
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
