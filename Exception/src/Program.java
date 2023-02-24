import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		System.out.println(" START OF METHOD 1");
		method2();
		System.out.println(" END OF METHOD 1");
	}
	
	public static void method2() {
		System.out.println(" START OF METHOD 2");
		Scanner sc = new Scanner(System.in);
		
		try{
			String[] vet = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vet[position]);			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			sc.next();
		}catch (InputMismatchException e) {
			System.out.println("Input error");
		}finally {
			System.out.println("End of Program!");
		}		
		
		sc.close();
		System.out.println("END OF METHOD 2");
	}
}
