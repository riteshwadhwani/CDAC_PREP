package org.bankaccount;

public class BankAccount {
	protected float accountBalance;
	public BankAccount(){
		
	}
	public void deposit(float amount) {
		this.accountBalance += amount;
	}
	public void withdraw(float amount) {
		
	}
	public String toString() {
		return "Balance is : " + this.accountBalance;
	}
}
