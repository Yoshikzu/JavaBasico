package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.0));
		list.add(new Product("Mouse",50.0));
		list.add(new Product("Tablet",350.5));
		list.add(new Product("HD Case",80.90));
		
		
		//Implementa��o de Interface
		list.forEach(new PriceUpdate());		
				
		//Reference Method com m�todo est�tico
		list.forEach(Product::staticPriceUpdate);			
				
		//Reference Method com m�todo n�o estatico
		list.forEach(Product::nonstaticPriceUpdate);
								
		//Express�o lambda declarada
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * 1.1); 
		};
		list.forEach(cons);					
				
		//Express�o Lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		list.forEach(System.out::println);
	
	}

}
