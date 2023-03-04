package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv",900.0));
		list.add(new Product("Mouse",50.0));
		list.add(new Product("Tablet",350.5));
		list.add(new Product("HD Case",80.90));
		
		//Implementação de Interface
		//Função map = função que aplica a todos elementos de uma stream e funciona somente para stream
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());		
		
		//Reference Method com método estático
		List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
				
		//Reference Method com método não estatico
		List<String> names3 = list.stream().map(Product::nonstaticUpperCaseName).collect(Collectors.toList());
		
		//Expressão lambda declarada
		Function<Product,String> fun = p -> p.getName().toUpperCase();		
		List<String> names4 = list.stream().map(fun).collect(Collectors.toList());
				
		//Expressão Lambda inline
		List<String> names5 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		names2.forEach(System.out::println);
		names3.forEach(System.out::println);
		names4.forEach(System.out::println);
		names5.forEach(System.out::println);
	}

}
