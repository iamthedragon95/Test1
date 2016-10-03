package com.niit.test.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity(name="CART")
@Component
public class Cart {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	private String username;
	
	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}



	private double totalprice;
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	


	@ManyToOne
	private Product product;
	
	private int quantity;

	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}