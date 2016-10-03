package com.niit.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity(name="ORDEREDTABLE")
@Component
public class OrderDetails {
	
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int OrderId;
	
	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public Cartitems getCartitems() {
		return cartitems;
	}

	public void setCartitems(Cartitems cartitems) {
		this.cartitems = cartitems;
	}
	@ManyToOne
	private Cartitems  cartitems;
	
}
