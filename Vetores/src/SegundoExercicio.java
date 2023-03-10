import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor: ");
		int n = sc.nextInt();		
		Product[] vect = new Product[n];
	
		for(int i=0; i < n; i++) {			
			System.out.println("Informe o nome do produto: ");
			String name = sc.next();
			System.out.println("Informe o preco: ");
			double price = sc.nextDouble();
					
			vect[i] = new Product(name,price);
		}
		
		
		double soma = 0;
		for(int i =0; i < vect.length; i++)
			soma += vect[i].getPrice();
		System.out.println("Media: " + soma/n);
		
		sc.close();
	}

}
