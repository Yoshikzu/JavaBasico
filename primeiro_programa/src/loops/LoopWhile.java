package loops;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		int soma = 0;
		while(x != 0) {
			soma += x;
			x = sc.nextInt();			
		}
			
		System.out.println("Soma: " + soma);
		sc.close();
	}

}
