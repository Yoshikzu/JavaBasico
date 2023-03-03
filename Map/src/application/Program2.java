package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv",900.0);
		Product p2 = new Product("Notebook",2300.0);
		Product p3 = new Product("Tablet",400.0);
		
		stock.put(p1,100000.0);
		stock.put(p2,200000.0);
		stock.put(p3,300000.0);
		
		Product ps = new Product("Tv",900.0);
		
		System.out.println("Contains ps key: " + stock.containsKey(ps));
	}

}
