package loops;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String resposta;
		char resposta;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double temperatura = sc.nextDouble();
			double temperaturaF = 9.0 * temperatura /5.0 + 32.0;
			System.out.printf("Equivalente a Fahrenheit: %.1f\n",temperaturaF);
			System.out.println("");
			System.out.println("Deseja repetir? (s/n): ");
			resposta = sc.next().charAt(0);
		}while(resposta == 's');
		
		System.out.println("Fim Programa");
		sc.close();

	}

}
