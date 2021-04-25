package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		BankDaoProvider pro=(BankDaoProvider) context.getBean("DaoImp");
		pro.deposit("181297", 5000);
		pro.withdraw("181297", 3000);

	}

}
