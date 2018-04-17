/**
 * 
 */
package com.training.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * ****************************************************************************************** 
 *	Program name        : 	Reorganize String
 *	Program Description :	Given a string S, check if the letters can be rearranged 
 *							so that two characters that are adjacent to each other are not
 *							the same.
 *  *****************************************************************************************
 *
 */
public class ReorganizeString {

	
	public static void main(String[] args) {
		 String input, output;
		 List<Character> characters = new ArrayList<>();

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Please type sentace to encode: ");
	        input = scanner.nextLine();

	        for(int i = 0; i < input.length(); i++) {
	            characters.add(input.charAt(i)); 
	        }
	        Iterator itr=characters.iterator();  
	        while(itr.hasNext()){  
	         System.out.print(itr.next());  
	        }  
	}

}
