/**
 * 
 */
package com.training.Apr19;

import java.util.Scanner;

/**
 * @author trainee
 *
 */
public class Calculator {

	/**
	 * @param args
	 * @return 
	 */
	static void validate(int numbs,int powrs)throws NegativeZeroNumberException{  
	     if(numbs<0 || powrs<0)  
	      throw new NegativeZeroNumberException("n or p should not be negative.");  
	     else  if(numbs==0 || powrs==0)
	    	 throw new NegativeZeroNumberException("n or p should not be zero.");  
	    //  System.out.println("Valid number and power");  
	   }  
	public static int power(int numrs,int pows)
	{
		if (pows == 0)
		{
			return 1;
        
		}
		
    else {
    	return numrs * power(numrs, pows - 1);
    	}
	}
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int numb1;
		int numb2;
		try {
		System.out.println("Enter base\t");
		numb1=read.nextInt();
		System.out.println("Enter power\t");
		numb2=read.nextInt();
		validate(numb1,numb2);
		long  rest=power(numb1,numb2);
		System.out.printf("%d^%d = %d", numb1,numb2, rest);	
		}catch(Exception c){System.out.println(c);}  
		
		
	}

}
