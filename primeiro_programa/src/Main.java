import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"Hello World");
		System.out.println("Hello World");
		double x = 3.28772;
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
		
		String linguagem = "Java";
		String framework = "Spring Boot";
		
		System.out.printf("A linguagem %s é a melhor do mundo e que tem framework %s.",linguagem,framework);
		
		//Entrada de Dados
		System.out.println("Digite um número");
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		
		System.out.println(entrada);
		char letra = sc.next().charAt(0);
		
		System.out.println("Digite o Nome e a sua idade");
		String nome = sc.next();
		int idade = sc.nextInt();
		System.out.println(nome);
		System.out.println(idade);
		
		sc.close();
		
		
	}

}
