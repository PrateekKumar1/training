/*  Program name        : 	Contains Duplicate
 *	Program Description :	Given an array of integers and an integer k, find out whether there are two distinct indices i and j
 *							in the array such that nums[i]=num[j] and the absolute difference between i and j is almost k'
 *  Date created		:	16-April-2018
 */
package com.training.April16testing;

import org.apache.log4j.Logger;

public class Duplicate {

	public static void main(String args[]) {
		final Logger lps=Logger.getLogger(Palindrome.class.getName());
        String s = "hdbfsd";
        lps.info(s + " " + check(s)); 
        s = "azprscd";
        lps.info(s + " " + check(s)); 
        s = "abberdin";
        lps.info(s + " " + check(s)); 
    }

 
     public static boolean check(String s) {
        for (int i = 0; i < (s.length() - 1); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return true;     
                }
            }
        }
        return false;
    }
	
}