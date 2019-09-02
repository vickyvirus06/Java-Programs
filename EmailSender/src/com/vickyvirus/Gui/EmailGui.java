package com.vickyvirus.Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import com.vickyvirus.Send.SendEmail;

public class EmailGui {
	JFrame frame;
	JTextField temp_user;
	JTextField temp_toEmail;
	JPasswordField temp_password;
	String username;
	String password;
	String toEmail;
	String path;
	String status;
	
	
	public EmailGui()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 728, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 726, 70);
		panel.setBackground(Color.BLUE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VickyVirus Email Sender");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 26));
		lblNewLabel.setBounds(200, 12, 404, 46);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBounds(0, 70, 726, 325);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_1.setBounds(36, 27, 103, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(0, 0, 139));
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_2.setBounds(36, 86, 103, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Send Email To");
		lblNewLabel_3.setForeground(new Color(0, 0, 139));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_3.setBounds(36, 160, 130, 26);
		panel_1.add(lblNewLabel_3);
		
		JButton attach = new JButton("Attach");
		attach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser j = new JFileChooser(); 
				  
	             
	            int r = j.showOpenDialog(null); 
	  
	             
	            if (r == JFileChooser.APPROVE_OPTION) 
	  
	            { 
	                
	                path = (j.getSelectedFile().getAbsolutePath()); 
	            } 
	             
	            else
	                JOptionPane.showMessageDialog(null,"the user cancelled the operation"); 
	        } 
	  
	   
	  
		});
		attach.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		attach.setForeground(new Color(255, 255, 0));
		attach.setBackground(new Color(128, 128, 128));
		attach.setFont(new Font("Dialog", Font.BOLD, 14));
		attach.setBounds(47, 229, 117, 35);
		panel_1.add(attach);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				username =  (temp_user.getText()).toString();
				password = (temp_password.getText()).toString();
				toEmail = (temp_toEmail.getText()).toString();
				SendEmail send_email = new SendEmail();
				String status = send_email.send(username, password, toEmail, path);
				status(status);
						
				
			}
		});
		submit.setForeground(new Color(65, 105, 225));
		submit.setBackground(new Color(124, 252, 0));
		submit.setFont(new Font("Dialog", Font.BOLD, 15));
		submit.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		submit.setBounds(234, 229, 126, 35);
		panel_1.add(submit);
		
		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		close.setForeground(Color.black);
		close.setBackground(Color.RED);
		close.setFont(new Font("Dialog", Font.BOLD, 15));
		close.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		close.setBounds(440, 229, 126, 35);
		panel_1.add(close);
		
		temp_user = new JTextField();
		temp_user.setText("poojarivicky3@gmail.com");
		temp_user.setFont(new Font("Dialog", Font.PLAIN, 14));
		temp_user.setBounds(200, 29, 249, 26);
		panel_1.add(temp_user);
		temp_user.setColumns(10);
		
		temp_toEmail = new JTextField();
		temp_toEmail.setText("siddhjavatechnologies@gmail.com");
		temp_toEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
		temp_toEmail.setBounds(200, 162, 249, 26);
		panel_1.add(temp_toEmail);
		temp_toEmail.setColumns(10);
		
		temp_password = new JPasswordField();
		temp_password.setFont(new Font("Dialog", Font.PLAIN, 15));
		temp_password.setBounds(212, 88, 218, 26);
		panel_1.add(temp_password);
		frame.setVisible(true);
		
	}
	
	public void status(String status)
	{
		if(status.equals("Sent"))
		{
			JOptionPane.showMessageDialog(null, "Message Sent");
			temp_password.setText("");
			temp_toEmail.setText("");
			path=null;
		}
		else if(status.equals("No File"))
		{
			JOptionPane.showMessageDialog(null, "Please Attach File");
			path = null;
		}
		else if(status.equals("Incorrect Recipient Id"))
		{
			JOptionPane.showMessageDialog(null, "Incorrect Recipient Id");
			temp_toEmail.setText("");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect Username Or Password");
			path=null;
			temp_password.setText("");
			temp_toEmail.setText("");
		}
		
	}

}
