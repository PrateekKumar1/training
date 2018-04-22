/**
 * 
 */
package com.training.bank;
/**
 * @author PRATEEK KR
 *
 */
class Account extends Bank {
Double balance=0.0;
Long accno;
/**
 * @param balance
 * @param accno
 */
public Account(Double balance,Long accno)
{
this.balance=balance;
this.accno=accno;
accno=accno++;
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
 * @param accno
 */
public void setaccno(Long accno)
{
this .accno=accno;
}
/**
 * @return
 */
public Long getaccno()
{
return accno;
}
/**
* @param args
*/
public static void main(String[] args) {

}

}
