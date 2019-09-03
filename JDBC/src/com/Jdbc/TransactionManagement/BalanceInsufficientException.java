package com.Jdbc.TransactionManagement;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException(int id)
	{
		super("Balance Not Sufficient" + id);
	}

}
