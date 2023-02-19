import java.util.Locale;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		System.out.println("Digite os valores das alturas:");
		for(int i=0; i < n; i++) {			
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("Alturas: ");
		double soma = 0;
		for(double valor: vect)
			soma += valor;
		System.out.println("Media: " + soma/n);
		
		sc.close();
	}

}
