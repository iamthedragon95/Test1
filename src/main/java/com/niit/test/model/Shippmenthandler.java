package com.niit.test.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.niit.test.controller.CartController;
import com.niit.test.controller.Ordercontroller;
import com.niit.test.service.Cartservice;

@Component
public class Shippmenthandler {
	public Shipping initFlow(){
		return new Shipping();
	}

	@Autowired(required=true)
	Cartservice cs;
	
	@Autowired(required=true)
	CartController cc;
	
	@Autowired
	Ordercontroller ordcntrl;
	
//	@Autowired
	//EmailAPI mailtouser;
	
	String username;
	
	

	
	
	/*public void send1(Shipping shippingdetails)
		{
		
			String toAddr =shippingdetails.getMailId(); 
			String fromAddr = "dhana2650@gmail.com";
	 
			// email subject
			String subject = "Order Conformation";
	
			// email body
			String body = "Hai"+" "+username+"."+System.getProperty("line.separator")+
					"It wil arrive as soon as posile"+System.getProperty("line.separator")
					+"Thanks to begin with us."+System.getProperty("line.separator")
					+System.getProperty("line.separator")
					+System.getProperty("line.separator")
					+System.getProperty("line.separator")
					+ "------------"+System.getProperty("line.separator")
					+ "-Mobiaces";
			mailtouser.mailmethod(toAddr, fromAddr, subject, body);
			
			
		}*/
		/*public void updatedeatils(Shipping shippingdetails){
			System.out.println("cartdetails"+username);
			//String username=cartcontroller.onnumilla();
			System.out.println("updtentrl"+username);
			Cartuser cud=new Cartuser(); 
			List<Cart> cu=cs.getAllCart(username);
			double tot = 0;
			for(int i=0;i<cu.size()-1;i++){
				tot+=cu.get(i).getTotalprice();
			}
			cud.setGrandtotal(tot);
			cud.setShippingdetails(shippingdetails);
			cs.addbuy(cud,username);			
		}*/
	
	
		public void savecart(Shipping shippingdetails){
		Cartitems cit=new Cartitems();
		int sid=shippingdetails.getSid();
		Shipping shipdet=cs.getShippingdetails(sid);
		cit.setShipping(shipdet);
		String username=cc.usernamedetails();
		List<Cart> cart=cs.getAllCart(username);
		System.out.println("ORDERCONTROLLER"+cart.size());
		double tot=0.00;
		for(int j=0;j<cart.size();j++){
			tot+=cart.get(j).getTotalprice();
		}
		cit.setGrandtotal(tot);
		for(int i=0;i<cart.size();i++){
			System.out.println("ORDERCONTROLLER2"+cart.size());
			Cart ct=cart.get(i);
			cit.setProductname(ct.getProduct().getName());
			cit.setProductprize(ct.getProduct().getPrice());
			cit.setTotalprice(ct.getTotalprice());
			cit.setQuantity(ct.getQuantity());
			/*cit.setShipping(shipdet);
			cit.setGrandtotal(tot);*/
			cs.savecart(cit);
			
			
		}
		
			
		}
		public void save(Shipping shippingdetails){
		
		System.out.println("control"+username);
		cs.saveshipment(shippingdetails);
		}
		public String validateDetails(Shipping shippingdetails, MessageContext messageContext){
			String status = "success";
			if(shippingdetails.getSname().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"sname").defaultText("Name Cannot Be Empty").build());
				status = "failure";
			}
			if(shippingdetails.getAddr1().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"Addr1").defaultText("This Field cannot be Empty").build());
				status = "failure";
			}
			if(shippingdetails.getAddr2().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"Addr2").defaultText("This Field cannot be Empty").build());
				status = "failure";
			}
			if(shippingdetails.getAddr3().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"Addr3").defaultText("This Field cannot be Empty").build());
				status = "failure";
			}
			if(shippingdetails.getCity().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"City").defaultText("password cannot be Empty").build());
				status = "failure";
			}
			if(shippingdetails.getPincode().isEmpty()){			
				messageContext.addMessage(new MessageBuilder().error().source(
						"pincode").defaultText("Pincode not valid").build());
				status = "failure";
				}
			
			if(shippingdetails.getPhoneNumber().isEmpty()){
				messageContext.addMessage(new MessageBuilder().error().source(
						"phoneNumber").defaultText("PHONE NUMBER cannot be Empty").build());
				status = "failure";
			}
				
			return status;
			
		}
		/*
		public void saveorder(Shipping shippingdetails)
		{
			Order order=new Order();
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			// Get the date today using Calendar object.
			//Calendar cal= Calendar.getInstance();
			Date today = Calendar.getInstance().getTime();        
			// Using DateFormat format method we can create a string 
			// representation of a date with the defined format.
			String reportDate = df.format(today);
			order.setOrderdate(reportDate);
			order.setStatus("Shipping");
			int sid=shippingdetails.getSid();
			System.out.println(sid);
			order.setUsername(username);
			System.out.println("ordercontroller"+username);
			Cartuser cartdetails=cs.getdetails(sid);
			order.setCartdetails(cartdetails);
			// Print what date is today!
			System.out.println("Report Date: " + reportDate);
			cs.addord(order);
		}*/
		
		


}
