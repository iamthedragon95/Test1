package com.niit.test.dao;

import java.util.List;

import com.niit.test.model.Cart;
import com.niit.test.model.Cartitems;
import com.niit.test.model.OrderDetails;
import com.niit.test.model.Shipping;

public interface Cartdao {

	void add(Cart cart);

	List<Cart> getAllCart(String username);

	void update(Cart cart);
	void deletecartitem(int cid);

	void saveshippment(Shipping shippingdetails);

	void savecart(Cartitems cit);



	void saveorder(OrderDetails ord);

	Object getShippingdetails(int sid);

	List<Cartitems> getallacrtitesm(int sid);

	void deleteallacrtitem(String username);

}
