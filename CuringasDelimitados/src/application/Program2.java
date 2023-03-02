package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		
		//Covariancia: aceita o get, mas não pode add
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		Number x = list.get(0);
		
		//Contravariancia pode add, mas não aceita o get
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Bob");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		
		//Number x = myNums.get(0);
		

	}

}
