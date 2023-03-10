package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			Map<String, Integer> candidates = new HashMap<>();			
			while(line != null) {
				String fields[] = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				if(candidates.get(name) == null) {
					candidates.put(name, votes);
				}else {
					Integer totalVotes = candidates.get(name);				
					candidates.put(name, votes + totalVotes);
				}
				line = bf.readLine();
			}
			
			for(String c : candidates.keySet())
				System.out.println(c + ": " + candidates.get(c));
			
		}catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
		sc.close();
	}

}
