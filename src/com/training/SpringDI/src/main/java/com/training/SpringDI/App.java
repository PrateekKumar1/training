package com.training.SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
final Customers cust1=ctx.getBean(Customers.class);
System.out.println( "Hello World!" );
    }
}
