package com.Jdbc.TransactionManagement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Jdbc.Util.JdbcUtil;



public class AccountDatabase {
public void transferFund(int source_acc,int dest_acc,double amt){
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	try {
		con=JdbcUtil.getMysql();
		
		
		con.setAutoCommit(false);
		System.out.println("Task 1 verify Destination Account");
		ps=con.prepareStatement("select * from account where id=?");
		ps.setInt(1, dest_acc);
		rs=ps.executeQuery();
		if(rs.next()){
		}else{
			throw new CustomerNotFoundException(dest_acc);
		}
		
		System.out.println("Task 2 Update Dest Account");
		ps=con.prepareStatement("update account set balance=balance+"+amt+" where id=?");
		ps.setInt(1, dest_acc);
		int x=ps.executeUpdate();
		if(x>0){
			System.out.println("Destination Account Updated Successfully..");
		}
		
		System.out.println("Task 3 verify Source Account");
		ps=con.prepareStatement("select * from account where id=?");
		ps.setInt(1, source_acc);
		rs=ps.executeQuery();
		double bal=0;
		if(rs.next()){
			bal=rs.getDouble("balance");
		}else{
			throw new CustomerNotFoundException(source_acc);
		}
		System.out.println("Task 4 Update Source Account");
		if(bal<amt){
			throw new BalanceInsufficientException(source_acc);
		}else{
		ps=con.prepareStatement("update account set balance=balance-"+amt+" where id=?");
		ps.setInt(1, source_acc);
		x=ps.executeUpdate();
		if(x>0){
			System.out.println("Source Account Deducted Successfully..");
		}
		}
		con.commit();
		System.out.println("Transaction Successfull... and commited");
	} catch (Exception e) {
		System.out.println(e);
		
		try {
			con.rollback();
			System.out.println("Rolled back ");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}finally{
		JdbcUtil.closeConnection(con, ps);
	}
}
}