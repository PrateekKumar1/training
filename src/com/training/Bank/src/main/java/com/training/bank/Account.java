/**
 * 
 */
package com.training.bank;
/**
 * @author PRATEEK KR
 *
 */
abstract class Account {
Double balance=0.0;
static long numb=1;
Long accno;
/**
 * @param balance
 * @param accno
 */
public Account(Double balance)
{
this.balance=balance;
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
* @param args
*/

}
