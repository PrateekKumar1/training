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
Map<Integer, Account> banks = new HashMap<Integer, Account>();
banks.put(1, sva[0]);
for (Map.Entry<Integer, Account> entry : banks.entrySet()) {
int key = entry.getKey();
Account b = entry.getValue();
LOGGER.info(key + " Mini Statement of :");
LOGGER.info("AccountNo:" + b.getAccountNumber() + "Account Balance: " + b.getBalance()+ "Deposit Amt " + depAmnt + "Withdraw Amt:" + withdAmnt);

}
}
}
