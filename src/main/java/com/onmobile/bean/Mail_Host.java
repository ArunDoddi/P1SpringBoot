package com.onmobile.bean;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;


public class Mail_Host {

	public void sendMail() {
	
		
		String host="mail.onmobile.com";
		final String user = "doddi.arun@onmobile.com";
		final String password = "Lastliving@34";
				
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
			message.setContent("<table>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:5cm;background-color:  #ff4000;text-align: center;\">\r\n" + 
					"    <td colspan=\"2\"style=\"border: 1px solid black;border-collapse: collapse; height:20px;width:5cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;background-color:#ff8000;text-align: center;\">\r\n" + 
					"    <th style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Information</th><th style=\"border: 1px solid black;border-collapse: collapse;width:9cm\">Details</th>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Issue Discription</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Reported By</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Operator</td>\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Location</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Reported Time</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">ETR</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">L1/L2 -Incident ID</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">L3 (Product support) - Incident ID</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Product</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Business Impact</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Revenue Impact</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Age of Incidence</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Action Taken</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Next Update</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"  <tr style=\"border: 1px solid black;width:9cm;text-align: center;\">\r\n" + 
					"    <td style=\"border: 1px solid black;border-collapse: collapse;width:6cm\">Status</td><td style=\"border: 1px solid black;border-collapse: collapse;width:9cm\"></td>\r\n" + 
					"  </tr>\r\n" + 
					"\r\n" + 
					"</table>", "text/html; charset=utf-8");
			
			Transport.send(message);
			System.out.println("Message sent......");	
			
			
		}catch(MessagingException e) {e.printStackTrace();}
		
	}
}