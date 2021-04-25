package com.model;

public interface BankDaoProvider {
	public void deposit(String acnt,float amount) throws Exception;
	public void withdraw(String acnt,float amount) throws Exception;

}
