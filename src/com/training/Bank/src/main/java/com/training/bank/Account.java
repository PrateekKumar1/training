/**
 * 
 */
package com.training.bank;

import java.io.IOException;

/**
 * @author PRATEEK KR
 *
 */
abstract class Account {
Customer custm;
SavingAccount sacc;
FlexibleSavingAccount fsa1;
CheckingAccount ca1;
private Double prin;
private Double rate;
private Double time;
private Double interest;
private Double totamt;
Double balance=0.0;
static long numb=1;
long accno;
/**
 * @param balance
 * @param custm
 */
public Account(Double balance,Customer custm,Double prin,Double rate,Double time)
{
this.balance=balance;
this.custm=custm;
this.prin=prin;
this.rate=rate;
this.time=time;
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
/**
 * @param prin
 */
public void setprin(Double prin) {
this.prin=prin;
}
/**
 * @return
 */
public Double getprin() {
return prin;
}
/**
 * @param rate
 */
public void setrate(Double rate) {
this.rate=rate;
}
/**
 * @return
 */
public Double getrate() {
return rate;
}
/**
 * @param time
 */
public void gettime(Double time)
{
this.time=time;
}
/**
 * @return
 */
public Double time() {
return time;

}
}
