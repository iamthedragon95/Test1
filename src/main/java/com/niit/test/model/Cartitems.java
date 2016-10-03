package com.niit.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity(name="CARTITEMS")
@Component
public class Cartitems {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Cartid;
	
	private double grandtotal;
	
	private String productname;
	 
	private int quantity;
	
	private double totalprice;
	
	private double productprize;
	
	@ManyToOne
	@JoinColumn(name="SID")
	private Shipping shipping;

	public int getCartid() {
		return Cartid;
	}

	public void setCartid(int cartid) {
		Cartid = cartid;
	}

	public double getGrandtotal() {
		return grandtotal;
	}

	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public double getProductprize() {
		return productprize;
	}

	public void setProductprize(double productprize) {
		this.productprize = productprize;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	

}
