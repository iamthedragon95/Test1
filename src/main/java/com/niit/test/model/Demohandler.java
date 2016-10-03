package com.niit.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import com.niit.test.service.RegisterService;



@Component
public class Demohandler {

	public Newuser initFlow(){
		return new Newuser();
	}

	@Autowired
	RegisterService rs;
	public String validateDetails(Newuser newuser,MessageContext messageContext){
		String status = "success";
		if(newuser.getFname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"fname").defaultText("Name Cannot Be Empty cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getAge()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"age").defaultText("Age cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getUsername()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"username").defaultText("UserName cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getPassword()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("password cannot be Empty").build());
			status = "failure";
		}
		if(newuser.getcPassword()==null){
			{
				if(newuser.getPassword().equals(newuser.getcPassword()))
					
			messageContext.addMessage(new MessageBuilder().error().source(
					"cPassword").defaultText("C_password not valid").build());
			status = "failure";
			}
		}
		if(newuser.getPhnumber()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"phnumber").defaultText("PHONE NUMBER cannot be Empty").build());
			status = "failure";
		}
		
			
		rs.s(newuser);
		
		return status;
	}
	@Autowired
	RegistrationEmail regmail;

	public void sendMail(Newuser userDetails) {
		String toAddress = userDetails.getEmail();
		String fromAddress = "dhana2650@gmail.com";
		String subject = "Music World";
		String body = "You have successfully gone through our site, keep in touch!!!";
		regmail.readyToSendMail(toAddress, fromAddress, subject, body);

	}
}