/**
 * 
 */
package com.training.bank;
/**
 * @author PRATEEK KR
 *
 */
abstract class Account {
Customer custm;
Double balance=0.0;
static long numb=1;
long accno;
/**
 * @param balance
 * @param custm
 */
public Account(Double balance,Customer custm)
{
this.balance=balance;
this.custm=custm;
accno=numb++;
}
/**
 * @param balance
 */
public void setbalance(Double balance)
{
this.balance=balance;
}
/**
 * @return
 */
public Double getbalance()
{
return balance;
}
/**
 * @return
 */
public long getAccountNumber() {
	return accno;
}


}
