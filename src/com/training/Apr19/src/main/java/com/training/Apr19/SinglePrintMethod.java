/**
* ************************************************************************************************************************ 
*	Program name        : 	Single Print method
*	Program Description :	Let's say you have an integer array and a string array. You have to write a single method
*				printarray that can print all the elements of both arrays. The method should be able to 
*				accept both integer and string arrays.
*   	Date	            :	19-April-2018
*  *********************************************************************************************************************** 
*
*/
package com.training.Apr19;


import java.util.Scanner;

/**
 * @author trainee
 * Generic method printarray is printing integer array list and string array list together.
 */
public class SinglePrintMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Scanner read=new Scanner(System.in);
		int range;
		int range2;
		int ioa;
		int soa;
		System.out.println("Enter number of elements for integer array\t");
		range=read.nextInt();
		Integer iar[]=new Integer[range];
		for(ioa=0;ioa<range;ioa++)
		{
			iar[ioa]=read.nextInt();
		}
		System.out.println("Enter number of elements for string array\t");
		range2=read.nextInt();
		String[] sar = new String[range2];
		for(soa=0;soa<range2;soa++)
		{
			sar[soa]=read.nextLine();
		}
	    System.out.println("-----------------------------------");
	    printarray(iar); // pass an Integer array
	    printarray(sar); // pass a String array
	    read.close();
	}
	public static <E> void printarray(E[] inputArray) {
	    // display array elements
	    for (E element : inputArray)
	      System.out.printf("%s ", element);

	    System.out.println();
	   
	  }
}
