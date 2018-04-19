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
package com.training.day2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author trainee
 * Here directory class is created with private members with setter and getter
 */
class Directory  {    
	private String fname, lname;
	private int number;
	private static int id = 1;

	public Directory(String fname, String lname, int number) {
	this.fname = fname;
	this.lname = lname;
	this.number = number;

	}

	public String getFname() {
	return fname;
	}

	public String getLname() {
	return lname;
	}

	public int getNumber() {
	return number;
	}

	public int getId() {
	return id++;
	}

}    


/**
 * @author trainee
 * PhoneBook class is accessing Directory class. Values are stored in list collection.
 *  
 *
 */
public class PhoneBook {
//	public PhoneBook(String name1, String name2, int phone) {
//		super(name1, name2, phone);
		
//	}

	/**
	 * @param args
	 */
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
		case 2:System.out.println("Remove the details of a person");
				Scanner sc1 = new Scanner(System.in);
				final int RemoveById = sc1.nextInt();
				dir.remove(RemoveById);
				System.out.println("Record deleted successfully");
				break;

		case 3:System.out.println("Search the details of a person by name");
				Scanner sc11 = new Scanner(System.in);
				String SearchByName = sc11.next();
				final Iterator<Directory> itr = dir.iterator();
				String isFound = null;
				while (itr.hasNext()) {
					Directory d11 = itr.next();
					isFound = d11.getFname();
					if (isFound.equalsIgnoreCase(SearchByName)) {
		// System.out.println("Record found/n");
						System.out.println(d11.getFname() + " " + d11.getLname() + " " + d11.getNumber() + " " + d11.getId());
					} else {
				System.out.println("Record not found");
					}
				}
		break;
		
				
		case 4:System.out.println("Enter phone number to be searched");
			   src3=rd.nextInt();
			//   if(src3==d1.phoneno)
		//	   {
			 for(Directory b:dir){  
				 System.out.println(b.getFname() + " " + b.getLname() + " " + b.getNumber() + " " +b.getId());
				     }  
			//  }
			  break;
		case 5:System.out.println("Enter number to be searched");
		      src3=rd.nextInt();
		   //   if(src3==d.id)
		  //    {
			     for(Directory b:dir){  
			    	 System.out.println(b.getFname() + " " + b.getLname() + " " + b.getNumber() + " " +b.getId());
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
