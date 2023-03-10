import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number:");
		String accountNumber = sc.next();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String nameHolder = sc.next();
						
		System.out.println("Is there an initial deposit? (y/n)");
		char resp = sc.next().charAt(0);		
		account = new Account(accountNumber,nameHolder);
		
		if(resp == 'y') {
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();
			account.deposit(value);
		}
		
		System.out.println(account);
		
		System.out.println("Enter a deposit value:");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println(account);
		
		System.out.println("Enter a withdraw value:");
		value = sc.nextDouble();
		account.withdaw(value);
		System.out.println(account);
		
		sc.close();
	}

}
