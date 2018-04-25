/**
 * 
 */
package com.training.bankspring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
public void nullfirstname() {
String str=null;
assertNotEquals("Null not allowed",cust.getfname());
}
@Test
public void nulllasttname() {
String str=null;
assertNotEquals("Null not allowed",cust.getlname());
}
@Test
public void nullemail() {
String str=null;
assertNotEquals("Null not allowed",cust.getEmail());
}
@Test
public void nulladress() {
String str=null;
assertNotEquals("Null not allowed",cust.getAddress());
}
@Test
public void nullpincodes() {
int pin;
assertNotEquals("Null not allowed",cust.getZip());
}
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
