package com.training.Apr19;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.InvalidClassException;

import org.junit.Before;
import org.junit.Test;


public class CalcTest {
Calculator test = new Calculator(); // Calculator is tested
@Before
public void setup()
{
test=new Calculator();
} 
@Test(expected=NegativeZeroNumberException.class)
public void exceptioncheckequalszero() throws NegativeZeroNumberException
{
test.validate(0, 0);
}
@Test(expected=NegativeZeroNumberException.class)
public void exceptionchecknegativebase() throws NegativeZeroNumberException
{
test.validate(-1, 2);
}
@Test(expected=NegativeZeroNumberException.class)
public void exceptionchecknegativepower() throws NegativeZeroNumberException
{
test.validate(2, -3);
}
}
