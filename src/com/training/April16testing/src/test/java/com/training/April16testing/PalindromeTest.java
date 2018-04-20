package com.training.April16testing;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PalindromeTest {
//	private static Palindrome pal;
	@Test
	public void testpalindrone()

	{
	Palindrome test = new Palindrome(); // Palindrome is tested

	// assert statements
	assertEquals("true", test.isPalindrome(121),true);
	assertEquals("false", test.isPalindrome(456),false);
	assertEquals("false", test.isPalindrome(-121),false);
	assertEquals("false", test.isPalindrome(-456), false);
	}
	

}
