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
 * @author PRATEEK KR
 *
 */
public class BankTest {
Customers cust = null; 

@Before
public void setup()
{
cust=new Customers("Prateek", "Kumar",123,798132456,"abc.12@xmail.com","C-12","Vasant Kunj","Delhi","Delhi", 501234);
} 
@Test
public void nullfirstname() {
final String str=null;
assertNotEquals("Null not allowed",cust.getfname());
}
@Test
public void nulllasttname() {
final String str=null;
assertNotEquals("Null not allowed",cust.getlname());
}
@Test
public void nullemail() {
final String str=null;
assertNotEquals("Null not allowed",cust.getEmail());
}
@Test
public void nullcity() {
final String str=null;
assertNotEquals("Null not allowed",cust.getcity());
}
@Test
public void nulladress() {
final String str=null;
assertNotEquals("Null not allowed",cust.getaddress());
}
@Test
public void nullprovince() {
final String province=null;
assertNotEquals("Null not allowed",cust.getprovince());
}
@Test
public void nullpincodes() {
final int pin;
assertNotEquals("Null not allowed",cust.getpincode());
}
@Test
public void testwithdrawpass() {
double balance=16000;
final double amount=1200;
assertTrue((balance=balance-amount)==14800);
}
@Test
public void testwithdrawfail() {
double balance=16000;
final double amount=1200;
assertTrue((balance=balance-amount)!=1800);
}
@Test
public void testdeposit() {
final int i=400;
double balance=1800;
assertTrue((balance=balance+i)==2200);	
}
}
