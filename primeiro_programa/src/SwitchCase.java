import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int semana = sc.nextInt();
		String dia;
		
		switch (semana) {
		case 1: {
			dia = "Domingo";
			break;
		}
		case 2: {
			dia = "Segunda";
			break;
		}
		case 3: {
			dia = "Terça";
			break;
		}
		case 4:{
			dia = "Quarta";
			break;
		}
		case 5: {
			dia = "Quinta";
			break;
		}
		case 6: {
			dia = "Sexta";
			break;
		}
		case 7:{
			dia = "Sábado";
			break;
		}
		default:
			dia = "Valor Inválido";
		}

		System.out.println("Dia: " + dia);
		sc.close();
	}

}
