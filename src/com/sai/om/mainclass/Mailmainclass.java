package com.sai.om.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class Mailmainclass {

	public static void main(String[] args) {
		System.out.println("mail starting");
		 ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
JavaMailSender mailsender=context.getBean(JavaMailSenderImpl.class);
SimpleMailMessage mailmessage=context.getBean(SimpleMailMessage.class);
    try{
    	
    mailmessage.setTo("vijura38@gmail.com");
    mailmessage.setSubject("test mail");
    mailmessage.setText("Hi sagar how r u");
    mailsender.send(mailmessage);
   
   System.out.println("mail sent successful"); 
	}catch(Exception e){
		System.out.println("some exception while sending mail"+e.getMessage());
	}
	}
}
