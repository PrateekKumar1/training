package com.training.day1;
import java.io.*;
import java.util.*;

public class Pallindrome {

	public static void main(String[] args) throws IOException, NumberFormatException,InputMismatchException{
		Scanner rd=new Scanner(System.in);
		int n,r,sum=0;
		int vr; //initializing temporary variable for input storage
		
		System.out.print("Enter the number \t");
		n=rd.nextInt();
		vr=n; //passing the initial value to temporary variable
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(vr==sum) //Equating initial number with the reversed number
		{
			
			System.out.print("true");
		}
		else
		{
					System.out.println("false");
		}
	
		
	}

}
