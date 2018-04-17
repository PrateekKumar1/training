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
interface EvenOdd {
	void check(int a[]);
}
	public static void main(String[] args) {
		int i,n,ch;
		Scanner rd=new Scanner(System.in);
		System.out.print("Enter the range\t");
		n=rd.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter elements");
		for(i=0;i<n;i++) {
			arr[i]=rd.nextInt();
		}
		
	}

}
