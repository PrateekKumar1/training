package com.training.Apr19;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import org.junit.Test;

public class SinglePrintJunitTest {
	@Test
	public void testcalculator()

	{
	SinglePrintMethod test = new SinglePrintMethod(); // Palindrome is tested

	// assert statements
	Assert.assertArrayEquals( printarray(23), true );
	Assert.assertArrayEquals( printarray("India"), true );
	}
}
