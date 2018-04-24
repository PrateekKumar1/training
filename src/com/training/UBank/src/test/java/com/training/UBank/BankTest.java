/**
 * 
 */
package com.training.UBank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * @author trainee
 *
 */
public class BankTest {
Customer cust=new Customer("Prateek", "Kumar",798132456,"abc.12@xmail.com","C-12","Vasant Kunj","Delhi",501234);
SavingAccount sva=new SavingAccount(1300,cust);
@Test
public void testwithdrawpass() {
double balance=16000;
double amount=1200;
assertTrue((balance=balance-amount)==14800);
}
@Test
public void testwithdrawfail() {
double balance=16000;
double amount=1200;
assertTrue((balance=balance-amount)!=1800);
}
@Test
public void testdeposit() {
int i=400;
double balance=1800;
assertTrue((balance=balance+i)==2200);	
}
}
