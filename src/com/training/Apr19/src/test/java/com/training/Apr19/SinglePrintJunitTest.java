package com.training.Apr19;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SinglePrintJunitTest {
	
SinglePrintMethod test = new SinglePrintMethod(); // SinglePrintMethod is tested
@Before
public void setup()
{
test=new SinglePrintMethod();
} 
//Test case1
@Test
{
	Integer iar[]=new Integer[] {1,4,7,8,9};
	assertEquals("True",1,test.printarray(iar);
}
//Test case2
@Test
{
	String[] sar=new String[] {"Hello","world","Welcome to java"};
	assertEquals("True",2,test.printarray(sar);
}
//Test case3
@Test throws IOException
{
	String[] sar=new String[] {1,2,"world","Welcome to java"};
	assertEquals("True",2,test.printarray(sar);
}

}
