package ApplicationSemOO;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double xA, xB, xC, yA, yB, yC, xArea, yArea;
		
		System.out.println("Informe os lados do Triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Informe os lados do Triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		xArea = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		yArea = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangulo X area: %.4%n",xArea);
		System.out.printf("Triangulo Y area: %.4%n",yArea);
		if(xArea > yArea) 
		   System.out.println("Maior ?rea: Triangulo X");
		else if (xArea < yArea)
			System.out.println("Maior ?rea: Triangulo Y");
		else
			System.out.println("Triangulos Iguais");
				
		sc.close();
	}

}
