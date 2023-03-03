package application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		//HashSet => mais rapido, mas não armazena a ordem
		//TreeSet => mais lento, mas armazena a ordem
		//LinkedHashSet => mantem a ordem que foi inserido
		//Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
				
		// System.out.println(set.contains("Notebook"));
		set.remove("Tablet");
		//set.removeIf(x => x.length() >= 3);
		//set.removeIf(x => x.charAt(0) == 'T'));
		
		for(String  p: set) {
			System.out.println(p);
		}

	}

}
