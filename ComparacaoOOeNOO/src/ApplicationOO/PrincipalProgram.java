package ApplicationOO;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter Product data... ");
		System.out.println("Name: ");
		String nome = sc.next();
		product.setName(nome);
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		product.setPrice(price);
		
		System.out.println("Quantity in Stock: ");
		int quantity= sc.nextInt();
		product.setQuantity(quantity);

		System.out.println(product);
		
		
		
		
		sc.close();
		

	}

}
