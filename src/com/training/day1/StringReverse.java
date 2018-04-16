package com.training.day1;
import java.*;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
	
		String s = "Let's take Leet contest"; // Given string
		StringTokenizer tkns = new StringTokenizer(s); //creating string tokenizer using the given string
		StringBuffer sb;
		
		while (tkns.hasMoreTokens()){ // checking tokens
		    sb = new StringBuffer (tkns.nextToken());
		    System.out.print(sb.reverse() + " "); //reversing each tokens and printing on terminal
		    }
		

	 	}

}
