/**
 * 
 */
package com.training.April16testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author trainee
 *
 */
public class DescPalinTest {

	@Test
	public void testdescpali()

	{
		DescPalindrome dpt = new DescPalindrome(); // Palindrome is tested

	// assert statements
		assertEquals("true", dpt.checkPalindrome("transylvania"),true);
		assertEquals("false", dpt.checkPalindrome("world"),false);
	
	}

}
