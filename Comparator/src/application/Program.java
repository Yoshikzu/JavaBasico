package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.0));
		list.add(new Product("Tablet",200.0));
		list.add(new Product("Notebook",2300.0));
		
		//list.sort(new MyComparator());
		
		//por Classe anonima
/*		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}			
		};
		//list.sort(comp);
		
		//
		list.sort(new Comparator<Product>(){
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}			
		});
		
		//Função anonima ou arrow function
		Comparator<Product> comp = (p1,p2) -> {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());				
		};
		list.sort(comp);
		*/
		Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());						
		list.sort(comp);
						
		//Expressão lambda - função anonima
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p: list)
			System.out.println(p);

	}

}
