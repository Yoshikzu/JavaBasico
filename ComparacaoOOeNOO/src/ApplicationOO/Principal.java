package ApplicationOO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Triangle triangleX, triangleY;
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Informe os lados do Triangulo X: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangleX = new Triangle(a,b,c);
		
		System.out.println("Informe os lados do Triangulo X: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangleY = new Triangle(a,b,c);
		
		triangleX.CalcularArea();
		triangleY.CalcularArea();
		
		System.out.println("Triangulo X area: " + triangleX.getArea());
		System.out.println("Triangulo Y area: " + triangleY.getArea());
		if(triangleX.getArea() > triangleY.getArea()) 
		   System.out.println("Maior área: Triangulo X");
		else if (triangleX.getArea() < triangleY.getArea())
			System.out.println("Maior área: Triangulo Y");
		else
			System.out.println("Triangulos Iguais");
		
		
		

	}

}
