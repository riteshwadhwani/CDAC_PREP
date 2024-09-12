import org.savingaccount.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.deposit(1000000.5f);
		System.out.println(s.toString());
		SavingsAccount s1 = new SavingsAccount();
		s1.deposit(20000000.21f);
		System.out.println(s1.toString());
		s.withdraw(1000);
		System.out.println(s.toString());
		
		

	}

}
