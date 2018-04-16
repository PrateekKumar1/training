package com.training.day1;

import java.util.Scanner;

public class DescPallindrome {

	public static void main(String[] args) {
		String original, reverse = ""; // Objects of String class
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter 10 inputs");
	      String[] arr=new String[10];
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string isn't a palindrome.");

	}

}
