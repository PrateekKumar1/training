/**
 * 
 */
package com.training.day2;
import java.util.*;
import java.io.*;
/**
 * ***************************************************************************************************************************** 
 *	Program name        : 	Phone Book
 *	Program Description :	You are given a phone book that consists of people's names and their  phone number. After that 
 *                         you will be given some person's name as query. For each query, print the phone number of that person.
 *                         Create a menu:
 *                         1.add data and sort in ascending order
 *                         2.remove data
 *                         3.search by name
 *                         4.search by number
 *                         5.search by sr no
 *                         Conditions:
 *                         A person's name consists of only lower-case English letters and it may be in the format 'first-name
 *                         last-name' or in the format 'first-name'.'first-name' is compulsory.
 *                         Each phone number has exactly 10 digits without any leading zeros.
 *  ****************************************************************************************************************************
 *
 */
class Directory {    
int id;    
String fname,lname,phoneno;    
  
public Directory(int id, String fname, String lname, String phoneno) {    
    this.id = id;    
    this.fname = fname;    
    this.lname = lname;    
    this.phoneno = phoneno;    
    }    
}    
public class PhoneBook {

	
	public static void main(String[] args) {
		Scanner rd=new Scanner(System.in);
		int n=0,ch;
		HashMap<Integer,Directory> pb=new HashMap<Integer,Directory>();//creating map of directory
		System.out.print("\t\tPhone Book\n1.add data and sort in ascending order\n2.remove data\n3.search by name\n4.search by number\r\n5.search by sr no");
		System.out.print("Enter your choice\t");
		ch=rd.nextInt();
		switch(ch)
		{
		case 1:
		}
	}

}
