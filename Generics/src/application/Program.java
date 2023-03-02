package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		
		PrintService<String> ps2 = new PrintService<>();
		
		System.out.print("How many values? ");
		int n2 = sc.nextInt();
		
		for(int i = 0; i < n2; i++) {
			String value = sc.next();
			ps2.addValue(value);
		}
		
		ps2.print();
		System.out.println("First: " + ps2.first());

		sc.close();

	}

}
