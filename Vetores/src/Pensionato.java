import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
				
		System.out.println("How many rooms will be rented? ");
		int numberRooms = sc.nextInt();
		
		for(int i=0; i < numberRooms; i++) {
			System.out.println("Rent #" + (	i+1)+ ":");
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email");
			String email = sc.next();			
			System.out.println("Number:");
			int number = sc.nextInt();						
			rooms[number] = new Rent(name,email);			
		}
		
		System.out.println("");
		System.out.println("Busy Rooms: ");
		for(int i =0; i< rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		sc.close();
	}

}
