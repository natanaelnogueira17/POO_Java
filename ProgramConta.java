package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		
		System.out.print("Enter acount number: ");
		int number = sc.nextInt();
		System.out.println("Enter acount holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
				
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println(" Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit values: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
			
		
		
		
		
		
		
		
		sc.close();
	}
	
	
	

}
