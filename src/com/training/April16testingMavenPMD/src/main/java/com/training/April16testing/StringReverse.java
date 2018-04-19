/*  Program name        : 	Reverse Words in a string
 *	Program Description :	Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and 
 *							initial word order.
 *							Example	-> Input: "Let's take Leetcode contest"
 *							           Output: "s'teL ekat edocteeL tsetnoc"
 *  Date created		:	16-April-2018
 */
package com.training.April16testing;

import java.util.*;

import java.util.logging.Logger;
public class StringReverse {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		//String str1 = "Let's take Leetcode contest"; // Given string
		String strn=read.next();
		if(isReverse(strn))
		{
			System.out.println(strn);
		}
		
	}
	public static boolean isReverse(String str1)
	{
		StringTokenizer tkns = new StringTokenizer(str1); //creating string tokenizer using the given string
		StringBuffer sbf1;
		
		while (tkns.hasMoreTokens()){ // checking tokens
		    sbf1 = new StringBuffer (tkns.nextToken());
		    System.out.println(sbf1.reverse() + " "); //reversing each tokens and printing on terminal
		    return true;
		    }
		return false;
		

	 	}
	}

