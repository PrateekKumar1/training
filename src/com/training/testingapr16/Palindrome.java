/*Program name        : 	Pallindrome
 *	Program Description :	Determine whether an integer is a palindrome. An integer is a
 *							palindrome when it reads the same backward as forward. 
 *  Programmer 			:   Prateek Kumar
 *  Date created		:	16-April-2018
 */


package com.training.testingapr16;
import java.io.*;
import java.util.*;

public class Palindrome {

	public static void main() throws IOException, NumberFormatException,InputMismatchException{ //Adding exceptions 
        final Scanner read=new Scanner(System.in);
		int number;
		int remainder;
		int sum;
		int virtual; //initializing temporary variable for input storage
		sum=0;
		System.out.print("Enter the number \t");
		number=read.nextInt();
		virtual=number; //passing the initial value to temporary variable
		while(number>0)
		{	
			remainder=number%10;
			sum=sum*10+remainder;
			number=number/10;
		}
		if(virtual==sum) //Equating initial number with the reversed number
		{			
			System.out.print("true");
		}
		else
		{
					System.out.println("false");
		}
	
		
	}

}