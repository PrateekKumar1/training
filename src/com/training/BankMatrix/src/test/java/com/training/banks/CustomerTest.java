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
<<<<<<< HEAD
=======
}

public void testnull(){
final Customers cust=new Customers();
cust.setFname("");
assertTrue(cust.getFname() == "");
}
>>>>>>> d42ad46982a3b12606b9a544c0ca4c67fc1e9546
}
