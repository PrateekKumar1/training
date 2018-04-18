/**
 * 
 */
package com.training.day2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


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
class Directory  {    
private static int id = 1;    
private String fname;
private String lname;
private int phoneno;    
  
public Directory(String fname, String lname, int phoneno) {    
       
    this.fname = fname;    
    this.lname = lname;    
    this.phoneno = phoneno;    
    }    


public String getFname() {
	return fname;
	}

public String getLname() {
	return lname;
	}

public int getNumber() {
	return phoneno;
	}

public int getId() {
	return id++;
	}
}    

public class PhoneBook extends Directory {

	
	

	public PhoneBook(String name1, String name2, int phone) {
		super(name1, name2, phone);
		
	}

	public static void main(String[] args) {
		Scanner rd=new Scanner(System.in);
		int n=0,ch,del,i = 0;
		String name1,name2,src,src1,src2;
		char a;
		int phone = 0,src3;
		List<Directory> dir = new ArrayList<>();//Creating list of Directory 
		
//		Directory d=new Directory(i, name1, name2, phone);
		do
		{
		System.out.println("\t\tPhone Book\n1.add data and sort in ascending order\n2.remove data\n3.search by name\n4.search by number\r\n5.search by sr no");
		System.out.print("Enter your choice\t");
		ch=rd.nextInt();
		switch(ch)
		{
		case 1:
			   
			   System.out.print("Enter first name\t");
			   name1=rd.next();
			   System.out.print("Enter second name\t");
			   name2=rd.next();
			   System.out.print("Enter phone number\t");
			   phone=rd.nextInt();
			   Directory d1=new Directory(name1, name2, phone);
			   dir.add(d1);
			   System.out.println("Added successfullyy!!");
			 // Collections.sort(dir);
			   break;
		case 2:System.out.print("Enter the id/phone number to delete data\t");
				del=rd.nextInt();
				//dir.remove(RemoveById);
				System.out.println("Record deleted successfully");
    			System.out.println("Details deleted");
			//	}
				break;
		case 3:System.out.println("Enter name to be searched");
				src=rd.next();
	//			if(src==d.fname || src== d1.lname)
	//			{
				for(Directory b:dir){  
					    System.out.println(b.id+" "+b.fname+" "+b.lname+" "+b.phoneno);  
					    }  
	//			}
				break;
		case 4:System.out.println("Enter phone number to be searched");
			   src3=rd.nextInt();
			//   if(src3==d1.phoneno)
		//	   {
			 for(Directory b:dir){  
				     System.out.println(b.id+" "+b.fname+" "+b.lname+" "+b.phoneno);  
				     }  
			//  }
			  break;
		case 5:System.out.println("Enter number to be searched");
		      src3=rd.nextInt();
		   //   if(src3==d.id)
		  //    {
			     for(Directory b:dir){  
			        System.out.println(b.id+" "+b.fname+" "+b.lname+" "+b.phoneno);  
			     }  
		  //    }
		      break;
		 default:System.out.println("Invalid choice!!!!!");
		 			break;
		
		}
		System.out.println("Continue(Y/N)");
        a =rd.next().charAt(0);

} while(a=='Y'|| a=='y');
		
	}

}