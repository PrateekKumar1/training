package com.training.April16testing;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.BeforeClass;

public class PalindromeTest {
	private static Palindrome pal;
	@Test
	public void testpalindrone()

	{
	Palindrome test = new Palindrome(); // Palindrome is tested

	// assert statements
	assertEquals("true", test.isPalindrome(121), 1);
	assertEquals("false", test.isPalindrome(456), 0);
	
	}
	

}
