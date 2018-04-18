/*Program name        : 	Pallindrome
 *	Program Description :	Determine whether an integer is a palindrome. An integer is a
 *							palindrome when it reads the same backward as forward. 
 *  Date created		:	16-April-2018
 */

package com.training.April16testing;
import java.util.*;
import java.util.logging.Logger;



public class Palindrome {
	
	public static void main(String args[]) { 
        final Scanner read=new Scanner(System.in);
        final Logger lps=Logger.getLogger(Palindrome.class.getName());
		int number;
		int remainder;
		int sum;
		int virtual; //initializing temporary variable for input storage
		sum=0;
		lps.info("Enter the number \t");
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
			lps.info("true");
		}
		else
		{
					lps.info("false");
		}
	
		
	}

}