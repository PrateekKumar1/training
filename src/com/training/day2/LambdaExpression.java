/**
 * 
 */
package com.training.day2;
import java.util.*;

/**
 * ****************************************************************************************************************** 
 *	Program name        : 	Lambda Expression
 *	Program Description :	Write the following methods that return a lambda expression performing a specific action-
 *                          PerformOperation isOdd() : The lambda expression must return true if a number is odd or 
 *                          false if it is even.
 *                          PerformOperation isPrime() : The lambda expression must return true if a number is prime
 *                          or false if it is composite.
 *                          PerformOperation isPalindrome() : The lambda expression must return true if a number is a
 *                          palindrome or false if it is not. 
 *                         
 *  *****************************************************************************************************************
 *
 */

public class LambdaExpression {
interface isOdd {
	public boolean odd(int a);
}
interface isPrime {
	public boolean primecomp(int a);
}
interface isPalindrome {
	public boolean palindrome(int a);
}

	public static void main(String[] args) {
		//lambda expression performing isOdd()
		int n=202;
		isOdd odd=(oddno)->
		{
			if(n%2!=0)
				return true;
			else 
				return false;
		};
		System.out.println(n+" is odd "+ odd.isOdd(n));
		//lambda expression performing isPrime()
				isPrime pr=(primeno)->
				{
					for(int i=2;i<n/2;i++)
					{
						if(n%i==0)
							return true;
					}
					
						return false;
				};
				System.out.println(n+" is prime "+ odd.isPrime(n));
		//lambda expression performing isPalindrome()
				int r,temp,sum=0;
				isPalindrome pl=(plmno)->
				{
					while(n>0)
					{
						r=n%10;
						sum=(sum*10)+r;
						n=n/10;
					}
					if(temp==sum) //Equating initial number with the reversed number
					{
						
						System.out.print("true");
					}
					else
					{
								System.out.println("false");
					}
				
				};
				System.out.println(n+" is odd "+ odd.isOdd(n));
	}

}
