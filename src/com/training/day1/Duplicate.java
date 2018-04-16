package com.training.day1;

public class Duplicate {

	public static void main(String[] args) {
        String s = "hdbfsd";
        System.out.println(s + " " + check(s)); 
        s = "azprscd";
        System.out.println(s + " " + check(s)); 
        s = "abberdin";
        System.out.println(s + " " + check(s)); 
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
