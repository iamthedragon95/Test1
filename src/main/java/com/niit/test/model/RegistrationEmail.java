package com.niit.test.model;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("registerMail")
@Transactional
public class RegistrationEmail {
	@Autowired
	MailSender regmail;

	@Transactional
	public void readyToSendMail(String toAddress, String fromAddress, String subject, String msgBody) {
		SimpleMailMessage regisMsg = new SimpleMailMessage();
		regisMsg.setFrom(fromAddress);
		regisMsg.setTo(toAddress);
		regisMsg.setSubject(subject);
		regisMsg.setText(msgBody);
		regmail.send(regisMsg);
	}

}
