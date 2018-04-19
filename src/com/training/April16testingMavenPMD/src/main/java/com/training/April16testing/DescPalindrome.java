package com.training.April16testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DescPalindrome {
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
	    	
	    	
	    	      }
	    	
	    	
	    	
	    
	    	System.out.println();
	    }
	public static void main(String[] args) {
		
	  //  checkPalindrome("Java");
	    checkPalindrome("121");
	    checkPalindrome("12321");
	}

}