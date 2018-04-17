/**
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

	
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		String s, output;
		 int d;
		 //int p,q;
		 List<Character> characters = new ArrayList<>();
	        System.out.print("Please enter the string: ");
	        s = rd.nextLine();
            for(int i = 0; i < s.length(); i++) {
	            characters.add(s.charAt(i)); 
	        }
	        Iterator itr=characters.iterator();  
	        while(itr.hasNext()){  
	         System.out.print(itr.next());  
	        }  
	        System.out.println();  
	        d=s.length()-2;
	        Collections.rotate(characters,-d) ;
	       // Collections.shuffle(characters);
	        System.out.print(characters);
	       /* for (p = 0; p < s.length()-1; p++) {
	            for (q = p+1; q < s.length(); q++) {
	                if (characters[p].equals(characters[q]) && p != q) {
	                    return true;
	                }
	            }
	        }*/


	
	        
	}

}
