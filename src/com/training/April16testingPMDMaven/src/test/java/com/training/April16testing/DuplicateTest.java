package com.training.April16testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateTest {
	@Test
	public void testduplicate()

	{
		Duplicate dpt = new Duplicate(); // Palindrome is tested

	// assert statements
		assertEquals("true", dpt.check("transylvania"),true);
		assertEquals("false", dpt.check("world"),false);
	
	}
}
