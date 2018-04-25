package com.training.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.training.model.BankU;

/**
 * @author PRATEEK KR
 *
 */
class App 
{
final static Logger lps = Logger.getLogger(App.class.getName());
final Scanner read=new Scanner(System.in);
public static void main( final String[] args )
{
final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
final BankU bank=ctx.getBean("bank", BankU.class);
final List<BankU> blist=new ArrayList<BankU>();
//IBankService bankService=ctx.getBean("bankService",BankServiceImpl.class);
//blist=bankService.addBank(bank);
}	
}
