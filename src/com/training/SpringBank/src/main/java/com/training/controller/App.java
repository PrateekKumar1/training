package com.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bankspring.Customers;
/**
 * @author PRATEEK KR
 *
 */
public class App 
{
/**
 * @param args
 */
public static void main( final String[] args )
{
final ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
final Customers custm1 = ctx.getBean(Customers.class);
final List<Customers> lSavingAccount = new ArrayList<Customers>();
lSavingAccount.add(custm1);
for (Customers custm : lSavingAccount) {
	System.out.println("retrieved element: " + custm);
}
}
}

