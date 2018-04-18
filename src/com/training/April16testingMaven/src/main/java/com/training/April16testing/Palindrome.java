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
		 if(isPalindrome(number))
			 lps.info(number + " is a Palindrome Number.");
	     else
	         lps.info(number + " is not a Palindrome Number.");
		
	}
	//function to check number is Palindrome or not
    public static boolean isPalindrome(int num)
    {
    	int rem,sum=0,temp;
    	temp=num;
    	while(num>0)
    	  {     
    	   rem=num%10;  //getting remainder  
    	   sum=sum*10 +rem;    
    	   num=num/10;
    	  }
    	  if(temp==sum)    
    	  {
    	   
    	return true;    
    	  
    	  }
    	  else 
    	  {
    	  return false;  
    	  }
    }
     
 }