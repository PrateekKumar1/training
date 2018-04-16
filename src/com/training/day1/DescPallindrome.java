package com.training.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DescPallindrome {
	public static void checkPalindrome(String s)
	  {
	    // reverse the given String
	    String reverse = new StringBuffer(s).reverse().toString();
	 
	    // check whether the string is palindrome or not
	    if (s.equals(reverse))
	    {  
	    	//System.out.println("Yes");
	    	
	    	
	    
	    	
	    		
	    		
	    		List<String> myList = new ArrayList<String>();
	    		myList.add(reverse);
	    		Collections.sort(myList, Collections.reverseOrder());
	    		
	    		
	    		for(String str: myList){
	    			System.out.println(str);
	    	   }
	    	
	    	   //   Iterator iter1 = myList.iterator();
	    	    //  while (iter1.hasNext()) {
	    	    //     System.out.println(iter1.next());
	    	      }
	    	
	    	
	    	
	    
	    	System.out.println();
	    }
	public static void main(String[] args) {
		/*String original, reverse = ""; // Objects of String class
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
*/
		// checkPalindrome("malayalam");
	    checkPalindrome("Java");
	    checkPalindrome("121");
	    checkPalindrome("12321");
	}

}
