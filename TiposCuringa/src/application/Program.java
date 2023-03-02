package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//Obs: não pode add um registro em uma lista em um tipo curinga
		
		List<Integer> myInts = Arrays.asList(5,2,20);
		printList(myInts);

		List<Integer> myInts = Arrays.asList(5,2,20);
		printList(myInts);
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list)
			System.out.println(obj);
	}

}
