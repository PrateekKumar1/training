package com.training.bankspring;

import com.training.service.Account;
import com.training.service.CustomerServ;
import com.training.service.CustomerServImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bankspring.Bank;
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

}
}

