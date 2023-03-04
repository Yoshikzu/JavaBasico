package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.0));
		list.add(new Product("Mouse",50.0));
		list.add(new Product("Tablet",350.5));
		list.add(new Product("HD Case",80.90));
				
		//Implementação de Interface
		list.removeIf(new ProductPredicate());
		
		//Reference Method com método estático
		list.removeIf(Product::staticProductPredicate);
		
		//Reference Method com método não estatico
		list.removeIf(Product::nonstaticProductPredicate);
		
		//Expressão lambda declarada
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;		
		list.removeIf(pred);			
		
		//Expressão Lambda inline
		list.removeIf(p -> p.getPrice() >= 100);
		
		for(Product p : list)
			System.out.println(p);
		

	}

}
