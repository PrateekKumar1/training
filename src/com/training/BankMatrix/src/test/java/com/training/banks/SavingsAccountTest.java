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
	 public void testwithdraw() { 
	 sa = new SavingsAccount(); 
	 double  expbalance=1000; 
	 assertTrue(sa.getBalance()==expbalance); 
	 }
	
	@Test
	public void testnull() {
		assertNotNull(sa);
	}
}
