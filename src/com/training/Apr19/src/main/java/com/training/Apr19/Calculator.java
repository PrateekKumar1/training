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
		System.out.println("Enter two numbers\t");
		numb1=read.nextInt();
		numb2=read.nextInt();
		long  rest=power(numb1,numb2);
		System.out.printf("%d^%d = %d", numb1,numb2, rest);	
		
	}

}
