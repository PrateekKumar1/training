/**
 * ****************************************************************************************** 
 *	Program name        : 	Reorganize String
 *	Program Description :	Given a string S, check if the letters can be rearranged 
 *				so that two characters that are adjacent to each other are not
 *				the same.
 *  *****************************************************************************************
 *
 */
package com.training.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * ****************************************************************************************** 
 *	Program name        : 	Reorganize String
 *	Program Description :	Given a string S, check if the letters can be rearranged 
 *				so that two characters that are adjacent to each other are not
 *				the same.
 *  *****************************************************************************************
 *
 */
public class ReorganizeString {

	
	public static void main(String[] args)  {
		final Scanner read = new Scanner(System.in);
		String strs;
		String outp;
		 int delta,india;
		 int p,q;
		 final List<Character> characters = new ArrayList<>();
	        System.out.print("Please enter the string: ");
	        strs = read.nextLine();
            for( india = 0; india < strs.length(); india++) {
	            characters.add(strs.charAt(india)); 
	        }
	        Iterator<Character> itr=characters.iterator();  
	        while(itr.hasNext()){  
	         System.out.print(itr.next());  
	        }  
	        System.out.println();  
	        delta=strs.length()-2;
	        Collections.rotate(characters,-delta) ;
	       // Collections.shuffle(characters);
	        for( india = 0; india < strs.length(); india++)
	       {
	     	if(characters.get(india)!=characters.get(india++))
	       	{
	        		characters.clear();
	        		characters.add("null");
	        		System.out.println(characters);
	       	}
	        	else
	        	{
	        		//characters.clear();
	       		System.out.print(characters);
	        	}

	        }
	        	        
	       /* for (p = 0; p < s.length()-1; p++) {
	            for (q = p+1; q < s.length(); q++) {
	                if (characters[p].equals(characters[q]) && p != q) {
	                    return true;
	                }
	            }
	        }*/


	
	        
	}

}
