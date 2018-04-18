package com.training.testingapr16;

import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
	
		String str1 = "Let's take Leet contest"; // Given string
		StringTokenizer tkns = new StringTokenizer(str1); //creating string tokenizer using the given string
		StringBuffer sbf1;
		
		while (tkns.hasMoreTokens()){ // checking tokens
		    sbf1 = new StringBuffer (tkns.nextToken());
		    System.out.print(sbf1.reverse() + " "); //reversing each tokens and printing on terminal
		    }
		

	 	}

}