/**
 * 
 */

package com.training.banks;

import com.training.model.Customers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * @author PRATEEK KR
 *
 */
public class CustomerTest {
	@Test
	public void testnull() {
		final Customers cust = new Customers();
		assertNotNull(cust.getFname());
	}

	@Test
	public void testinput() {
		final Customers cust = new Customers();
		Integer mobile=456798;
		assertTrue(cust.getMobile()==mobile);
	}
}
