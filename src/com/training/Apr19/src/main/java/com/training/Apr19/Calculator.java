/**
* ********************************************************************************************************************************************************************** 
*	Program name        : 	Calculator
*	Program Description :	Compute the power of a number by implementing a calculator. Create class MyCalculator which consists of a single method long power(int,int)
*							This method takes two integer, n and p as parameters and finds n^p. If either n or p is negative, then the method must through an exception 
*							which says "n or p should not be zero". Also if both are zero, then the method must throw an exception which says "n and p should not be
*							zero".
*							Constraints
*								-10<=n<=10
*								-10<=p<=10
*   Date				:	19-April-2018
*  ********************************************************************************************************************************************************************* 
*
*/
package com.training.Apr19;

import java.util.Scanner;

/**
 * @author trainee
 *
 */
public class Calculator {

	/**
	 * @param args
	 * @return 
	 */
static void validate(int numbs,int powrs)throws NegativeZeroNumberException{  

if(numbs==0 && powrs==0)
	throw new NegativeZeroNumberException("n and p should not be zero.");  
else if(numbs<0 || powrs<0)  
	throw new NegativeZeroNumberException("n or p should not be negative.");  
else  if(numbs==0 || powrs==0)
    throw new NegativeZeroNumberException("n or p should not be zero."); 
}	     
	    

public static int power(int numrs,int pows)
{
if (pows == 0)
{
return 1;
}
else {
return numrs * power(numrs, pows - 1);
}
}
public static void main(String[] args) {
Scanner read=new Scanner(System.in);
int numb1;
int numb2;
final long  rest;
try {
System.out.println("Enter base\t");
numb1=read.nextInt();
System.out.println("Enter power\t");
numb2=read.nextInt();

validate(numb1,numb2);
rest=power(numb1,numb2);
System.out.printf("%d^%d = %d", numb1,numb2, rest);	

}catch(Exception c){System.out.println(c);}  
		
		
	}

}
