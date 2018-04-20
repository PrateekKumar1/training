package com.training.Apr19;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalcJunit {
	@Test
	public void testcalculator()

	{
	Calculator test = new Calculator(); // Palindrome is tested

	// assert statements
	assertEquals("true", test.validate(1,4),true);
	assertEquals("false", test.validate(-5,3),false);
	assertEquals("false", test.validate(3,-4)),false);
	assertEquals("false", test.validate(0,0), false);
	//assertFalse()
	}
}
