package loops;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		System.out.println("Digite um valor:");
		for(int i=0; i < n  ;i++) {
			int entrada = sc.nextInt();
			soma+= entrada;
		}
		System.out.println("Soma: " + soma);

	}

}
