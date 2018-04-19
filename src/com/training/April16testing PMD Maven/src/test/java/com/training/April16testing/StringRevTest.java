package com.training.April16testing;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
public class StringRevTest {
//	private static StringReverse srrv;
	@Test
	public void teststringreverse()

	{
		StringReverse srt = new StringReverse(); 

	// assert statements
	assertEquals("true", srt.isReverse("Hello World"),true);
	
	}

}
