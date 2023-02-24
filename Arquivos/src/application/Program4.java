package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good Morning","Good afternoon","Good evening"};
		String path =  "C:\\Users\\marce\\Documents\\Estudos\\Java\\Projetos\\Eclipse-Projects\\Arquivos\\novoteste.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
