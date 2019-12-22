package com.onmobile.bean;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;


public class Mail_Host {

	public static void main(String args[]) {
	
		
		String host="mail.onmobile.com";
		final String user = "doddi.arun@onmobile.com";
		final String password = "Your Password";
				
		String to = "doddi.arun@onmobile.com";
		
		//get the session objects
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host",host);
		prop.put("mail.smtp.auth","true");
		
		Session session = Session.getDefaultInstance(prop,new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}
		});
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Demo mail");
			//message.setText("hi arun");
			message.setContent("<!DOCTYPE html><html><head><style>table {font-family: arial, sans-serif;border-collapse: collapse;width: 100%;}td, th {border: 1px solid #dddddd;text-align:left;\r\n" + 
					"padding: 8px;}tr:nth-child(even) {  background-color: #dddddd;}</style></head><body><h2>HTML Table</h2><table><tr><th>Company</th><th>Contact</th><th>Country</th></tr><tr><td>Alfreds Futterkiste</td><td>Maria Anders</td><td>Germany</td></tr><tr><td>Centro comercial Moctezuma</td><td>Francisco Chang</td><td>Mexico</td></tr><tr><td>Ernst Handel</td><td>Roland Mendel</td><td>Austria</td></tr><tr><td>Island Trading</td><td>Helen Bennett</td><td>UK</td></tr><tr><td>Laughing Bacchus Winecellars</td><td>Yoshi Tannamuri</td><td>Canada</td></tr></table></body></html>", "text/html; charset=utf-8");
			
			Transport.send(message);
			System.out.println("Message sent......");
			
			
			
		}catch(MessagingException e) {e.printStackTrace();}
		
	}
}