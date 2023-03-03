package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username","Maria");
		cookies.put("email","maria@gmail.com");
		cookies.put("fone", "9978555552");
		
		cookies.remove("email");
		cookies.put("fone", "1223444");
		
		System.out.println("Contains key fone: " + cookies.containsKey("fone"));
		System.out.println("Phone number: " + cookies.get("fone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All cookies:");
		for(String key : cookies.keySet())
			System.out.println(key + ": " + cookies.get(key));
		
		
	}

}
