package com.vickyvirus.Send;

import java.util.Properties;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.net.ssl.SSLSession;

public class SendEmail{
	String username,password,toEmail,path;
	public String send(String username,String password,String toEmail,String path)
	{
		
		this.username= username;
		this.password=password;
		this.toEmail = toEmail;
		
		this.path = path;
		if(path==null)
		{
			return "No File";
		}
		
	Properties properties = new Properties();
	properties.put("mail.smtp.auth", "true");
	properties.put("mail.smtp.starttls.enable", "true");
	properties.put("mail.smtp.host","smtp.gmail.com");
	properties.put("mail.smtp.port", "587");
	
	Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(username,password);
		}
	});
	
	MimeMessage msg = new MimeMessage(session);
	try {
		msg.setFrom(new InternetAddress(username));
		
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			Multipart emailContent = new MimeMultipart();
			
		MimeBodyPart attachment = new MimeBodyPart();
		attachment.attachFile(path);
		emailContent.addBodyPart(attachment);
		msg.setContent(emailContent);
		Transport.send(msg);
		
	} catch (MessagingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
}		
	return "Sent";
		}
	
	
		
	}
	
