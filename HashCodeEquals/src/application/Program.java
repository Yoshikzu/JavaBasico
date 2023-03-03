package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		String c = "Maria";
		
		//Equals => 100% e mais lento
		//HashCode => rapido, mas n�o 100%, pode haver colis�o
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Client c1 = new Client("Maria","maria@gmail.com");
		Client c2 = new Client("Alex","alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c == a);

	}

}
