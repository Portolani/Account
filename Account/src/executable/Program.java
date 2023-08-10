package executable;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder  = sc.nextLine();
			sc.nextLine();
			System.out.print("Inicial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withDrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withDrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.print(account);
			
			sc.close();
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
	}
	
}
