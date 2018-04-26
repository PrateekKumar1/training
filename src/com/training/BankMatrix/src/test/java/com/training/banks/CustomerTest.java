package com.training.banks;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.training.model.Customers;
/**
 * @author PRATEEK KR
 *
 */
public class CustomerTest {
@Test
public void testnull(){
final Customers cust=new Customers();
cust.setFname("");
assertTrue(cust.getFname() == "");
}
@Test
public void testinput(){
final Customers cust=new Customers();
cust.setMobile(132456);
assertTrue(cust.getMobile()==1234650);
}
}

public void testnull(){
final Customers cust=new Customers();
cust.setFname("");
assertTrue(cust.getFname() == "");
}
}
