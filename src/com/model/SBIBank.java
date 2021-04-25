package com.model;

import org.springframework.stereotype.Component;

import com.exception.InvalidAccountException;

public class SBIBank implements BankDaoProvider {

	float amount=5000;
	@Override
	public void deposit(String acnt, float amount) throws Exception {
		// TODO Auto-generated method stub
		if(acnt.equals("181297"))
		{
			System.out.println("Previous amount was "+this.amount);
			this.amount=amount+this.amount;
			System.out.println("New amount is "+this.amount);
		}
		else
		{
			throw new InvalidAccountException("Invalid Account");
		}
		
	}

	@Override
	public void withdraw(String acnt, float amount) throws Exception {
		// TODO Auto-generated method stub
		if(acnt.equals("181297"))
		{
			if(this.amount>amount)
			{
				this.amount=this.amount-amount;
				System.out.println(amount+" deducted");
				System.out.println("New Amount is "+this.amount);
			}
			else
				System.out.println("Insufficient Amount");
		}
		else
		{
			throw new InvalidAccountException("Invalid Account");
		}
		
	}

}
