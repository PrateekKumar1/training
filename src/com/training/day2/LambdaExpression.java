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
package com.training.day2;


import java.util.*;


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
		Scanner read=new Scanner(System.in);
		int numb;
		System.out.println("Enter the number\t ");
		numb=read.nextInt();
		isOdd odd=(oddno)->
		{
			if(numb%2!=0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		};
		System.out.println(numb+" is odd "+ odd.odd(numb));
		//lambda expression performing isPrime()
				isPrime prim=(primeno)->
				{
					for(int i=2;i<numb/2;i++)
					{
						if(numb%i==0)
							return true;
					}
					
						return false;
				};
				System.out.println(numb+" is prime "+ prim.primecomp(numb));
		//lambda expression performing isPalindrome()
				
				isPalindrome plnd=(plmno)->
				{ 			
					int numb2,revs,temp,sum=0;
					numb2=numb;
					temp=numb2;
					while(numb2>0)
					{
						revs=numb2%10;
						sum=sum*10+revs;
						numb2=numb2/10;
					}
					if(temp==sum) { //Equating initial number with the reversed number
						return true;
					}
					else {
					
						return false;
					}
					
				
				};
				System.out.println(numb+" is palindrome "+ plnd.palindrome(numb));
	}

}
