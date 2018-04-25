package com.training.controller;

import com.training.service.Account;
import com.training.service.CustomerServ;
import com.training.service.CustomerServImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bankspring.Bank;
import com.training.bankspring.Customers;
/**
 * Hello world!
 *
 */
public class App 
{
public static void main( final String[] args )
{
final ApplicationContext ctx = new ClassPathXmlApplicationContext("CustomerBeans.xml");
final Customers custm1 = ctx.getBean(Customers.class);
List<Customers> lSavingAccount = new ArrayList<Customers>();
lSavingAccount.add(custm1);
for (Customers item : lSavingAccount) {
	System.out.println("retrieved element: " + item);
}
}
}

