package com.niit.test.controller;

import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niit.test.model.Cartitems;
import com.niit.test.model.Newuser;
import com.niit.test.model.OrderDetails;
import com.niit.test.model.Shipping;
import com.niit.test.service.Cartservice;
import com.niit.test.service.RegisterService;

@Controller
public class Ordercontroller {
	
	@Autowired
	Cartservice cs;
	
	@Autowired
	CartController cc;
	
	@Autowired
	RegisterService rs;
	
	public String saveorder(Shipping shippingdetails)
	{
		String maild=null;
		OrderDetails ord=new OrderDetails();
		String username=cc.usernamedetails();
		System.out.println("ORDER"+username);
		List<Newuser> n=rs.getallusers(username);
		for(Newuser nu:n)
		{
		maild=nu.getEmail();
		}
		System.out.println(maild);
		int sid=shippingdetails.getSid();
		List<Cartitems> cit=(List<Cartitems>) cs.getallacrtitems(sid);
	for(int i=0;i<cit.size();i++)
		{
			Cartitems cartdetails=cit.get(i);
			ord.setCartitems(cartdetails);
			ord.setUsername(username);
			cs.saveorder(ord);
			
		}
	cs.deleteallcartitem(username);
		return "redirect:/";
	}

	

}
