package com.Jdbc.TransactionManagement;

public class CustomerNotFoundException  extends Exception{

	public CustomerNotFoundException(int id)
	{
		super("Customer Not Found with " + id);
	}
}
