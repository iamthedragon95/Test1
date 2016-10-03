package com.niit.test.service;

import java.util.List;

import com.niit.test.model.Cart;
import com.niit.test.model.Cartitems;
import com.niit.test.model.OrderDetails;
import com.niit.test.model.Shipping;

public interface Cartservice {
	void add(Cart cart);

	public List<Cart> getAllCart(String username);
	void update(Cart cart);
	void deletecartitem(int cid);

	void saveshipment(Shipping shippingdetails);

	void savecart(Cartitems cit);

	

	void saveorder(OrderDetails ord);

	Shipping getShippingdetails(int sid);

	List<Cartitems> getallacrtitems(int sid);

	void deleteallcartitem(String username);

}
