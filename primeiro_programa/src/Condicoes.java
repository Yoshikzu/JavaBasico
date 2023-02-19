import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
						
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Informe horário atual: ");
		int num2 = sc.nextInt();
		
		if(num2 > 5 && num2 <12) {
			System.out.println("Bom dia " + nome);
		}else if(num2 < 18) {
			System.out.println("Boa Tarde " + nome);
		}else {
			System.out.println("Boa Noite " + nome);
		}
		
		if(nome == "Marcelo" || num2 == 10) {
			System.out.println("Bem vindo Sr. dev!");
		}
		
		
		

	}

}
