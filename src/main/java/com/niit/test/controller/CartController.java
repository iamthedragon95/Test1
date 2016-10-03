package com.niit.test.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.test.model.Cart;
import com.niit.test.model.Product;
import com.niit.test.service.Cartservice;
import com.niit.test.service.ProductService;
@Controller
public class CartController {
	@Autowired
	Cartservice cs;
	
	@Autowired
	ProductService ps;
	
	
	String username;
	
	@ModelAttribute
	public void getuserdata(HttpServletRequest req) {
			Authentication au = SecurityContextHolder.getContext().getAuthentication();
	String name = au.getName();

		HttpSession ses = req.getSession();
		ses.setAttribute("u", name);
		username = (String) ses.getAttribute("u");
		
		System.out.println((String) ses.getAttribute("u"));
	}

	
	@RequestMapping(value ="/addtocart/{id}")
	public String add(@PathVariable("id") String id) {
		Cart cart=new Cart();
		System.out.println("ENRYLOOP"+id);
		Product pm=ps.getProductModel(id);
		System.out.println("CARTCONTROLLER"+username);
		cart.setUsername(username);
		List<Cart> allCart = (List<Cart>) cs.getAllCart(username);
		List<Cart> p = allCart;
		for(int i=0;i<p.size();i++)
		{
			
			String pid=p.get(i).getProduct().getId();
			System.out.println(pid);
			System.out.println(id);
			if(pid.equals(id))
			{	System.out.println("Existing avaiable loop");
					int quan=p.get(i).getQuantity()+1;
				p.get(i).setQuantity(quan);
				p.get(i).setTotalprice(p.get(i).getProduct().getPrice()*quan);;
				System.out.println("update");
				cs.update(p.get(i));
				return "redirect:/viewcart";
			}
		}
		System.out.println("newproduct");
		
		cart.setQuantity(1);
		double tot=pm.getPrice();
		System.out.println("NEWTOTAL"+tot);
		cart.setTotalprice(tot);
		cart.setProduct(pm);
		cs.add(cart);
		return "redirect:/viewcart";
	}

	@RequestMapping(value = "/viewcart")
	public String cart(Map<String, Object> map, Cart cart) {

		map.put("cart", cart);
		map.put("cartlist", cs.getAllCart(username));

		return "Cart";
	}
	@RequestMapping(value="/deleted/cartitem/{cid}")
	public String deleteaction(@PathVariable("cid") int cid)
	{
		cs.deletecartitem(cid);
		return "redirect:/viewcart";
	}

	public String usernamedetails()
	{
		System.out.println("SUPERMAN"+username);
		return username;
	}
}
