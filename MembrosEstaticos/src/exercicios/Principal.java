package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double priceDollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double amountDollars = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.convertDollarsToReal(priceDollar, amountDollars));
		sc.close();			

	}

}
