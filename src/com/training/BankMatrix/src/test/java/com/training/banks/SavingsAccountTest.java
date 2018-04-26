/**
 * 
 */

package com.training.banks;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.training.model.SavingsAccount;
import org.junit.Before;
import org.junit.Test;



/**
 * @author PRATEEK KR
 *
 */
public class SavingsAccountTest {
	SavingsAccount sa;

	@Before
	public void setup() {
		sa = new SavingsAccount();
	}

	 @Test 
	 public void testbalance() { 
	 sa = new SavingsAccount(); 
	 double  expbalance=1000; 
	 assertTrue(sa.getBalance()==expbalance); 
	 double exbal=2000;
	 assertTrue(sa.getBalance()==exbal);
	 }
	
	@Test
	public void testnull() {
		assertNotNull(sa);
	}
	/*
	@Test
	public void testwithdraw() {
	double exbal=5000;
	}*/
}
