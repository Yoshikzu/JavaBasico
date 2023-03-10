import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int number = sc.nextInt();
		
		for(int i =0; i < number; i++) {
			sc.nextLine();
			System.out.println("Employee " + (i+1) + ":");
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id,name,salary));			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		int position = hasId(list,id);
		if (position == 0) {
			System.out.println("This id does not exist!");
		}else {
			list.get(position).setSalary(list.get(position).getSalary() * 1.1);			
		}
		
		for(Employee emp : list)
			System.out.println(emp);
		
		sc.close();
	}
	
	public static Integer hasId(List<Employee> list, int id) {
		for(int i  =0; i < list.size();i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return 0;
	}

}
