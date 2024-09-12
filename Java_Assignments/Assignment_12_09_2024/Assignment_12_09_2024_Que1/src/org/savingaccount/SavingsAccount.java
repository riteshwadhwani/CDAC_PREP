package org.savingaccount;

import org.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {
	private static float limit = 200000;
	@Override
		public void withdraw(float amount) {
				if(this.accountBalance > amount) {
					if(amount < SavingsAccount.limit ) {
						this.accountBalance -= amount;
						System.out.println("Withdrawal Sucessfull");
					}
					else {
						System.out.println("Limit Reached!!");
					}
				}
				else {
					System.out.println("Insufficient Balance!!");
				}
		}
}
