package com.training.UBank;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
/**
 * @author PRATEEK KR
 *
 */
public class Stmt extends Bank 
{
public static void main( String[] args )
{
final  Logger LOGGER = Logger.getLogger(Stmt.class.getName());
Customer cust1 = new Customer("Prateek", "Kumar",798132456,"abc.12@xmail.com","C-12","Vasant Kunj","Delhi",501234);
SavingAccount sva[] = new SavingAccount[8];
sva[0] = new SavingAccount(1000, cust1);

sva[0].Display();
double depAmnt = sva[0].Deposit(1000);
sva[0].Display();
double withdAmnt = sva[0].Withdraw(1000);
//System.out.println(" Balance after adding interest rate is :");
sva[0].addInterest();
sva[0].Display();
// Creating another account for customer
Customer cust2 = new Customer("India", "K",898132456,"ind32@hmail.com","B132","Mars","Lucknow",781234);

sva[1] = new SavingAccount(5000, cust2);

sva[1].Display();
sva[1].Deposit(1000);
sva[1].Display();
sva[1].Withdraw(700);
sva[1].addInterest();
sva[1].Display();

Map<Integer, Account> banks = new HashMap<Integer, Account>();
banks.put(1, sva[0]);
banks.put(2, sva[1]);

for (Map.Entry<Integer, Account> entry : banks.entrySet()) {
int key = entry.getKey();
Account b = entry.getValue();
LOGGER.info(key + " Mini Statement of :");
LOGGER.info("AccountNo:" + b.getAccountNumber() + "Account Balance: " + b.getBalance()+ "Deposit Amt " + depAmnt + "Withdraw Amt:" + withdAmnt);

}
}
}