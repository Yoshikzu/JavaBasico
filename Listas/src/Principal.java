import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("Maria");
		list.add("Antunes");
		list.add("Dani");
		list.add("Anna");
		
		for(String element : list) {
			System.out.println(element);
		}
		
		list.add(2,"Marcos");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println(list);
		System.out.println("Tamanho: " + list.size());		
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list);
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Maria: " + list.indexOf("Maria"));
				
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		System.out.println(result);
		
		
		
		
		
		
		

	}

}
