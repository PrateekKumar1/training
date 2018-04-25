package com.training.bankspring;

import com.training.service.Account;
import com.training.service.CustomerServ;
import com.training.service.CustomerServImpl;
import com.training.bankspring.Bank;
/**
 * Hello world!
 *
 */
public class App 
{
 public static void main( final String[] args )
 {
CustomerServ serv = new CustomerServImpl();
System.out.println(serv.findAll().get(0).getfname());
System.out.println("Welcome To" + Bank.name);
final Customers cust1 = new Customers("Prateek","Kumar",123,456123798,"pk.13@xmail.com","A-123","Sector-4 Parel","Mumbai","Maharashtra",441019);
Account Arr[] = new SavingAccount[5];
Arr[0] = new SavingAccount(1000, cust1);
Arr[0].Disp();
double depAmnt = Arr[0].Deposit(1000);
Arr[0].Disp();
	double withdAmnt = Arr[0].Withdraw(1000);
		
		Arr[0].addInterest();
		Arr[0].Disp();
		Customers cust2 = new Customers("Anthony","Gomes",783,510123798,"ag132@ycmail.com","Axh-12","Sector-13 Gurgaon","Delhi NCR","Delhi",741019);

		Arr[1] = new SavingAccount(5000, cust2);

		Arr[1].Disp();
		Arr[1].Deposit(1000);
		Arr[1].Disp();
		Arr[1].Withdraw(700);
		//System.out.println(" Balance after adding interest rate is :");
		Arr[1].addInterest();
		Arr[1].Disp();

		// Code for printing the statement of each customer

		Map<Integer, Account> hm = new HashMap<Integer, Account>();
		hm.put(1, Arr[0]);
		hm.put(2, Arr[1]);

		for (Map.Entry<Integer, Account> entry : hm.entrySet()) {
			int key = entry.getKey();
			Account b = entry.getValue();
			System.out.println(key + " Mini Statement of :");
			System.out.println("AccountNo:" + b.getaccnumb() + "Account Balance: " + b.getBalance()
					+ "Deposit Amt " + depAmnt + "Withdraw Amt:" + withdAmnt);

		}
    }
}
