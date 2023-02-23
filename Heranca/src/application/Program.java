package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001,"Alex",0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING => Casting da subclasse para superclasse
		//Uso comum: Polimorfismo
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
		Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.1);
				
		
		//DOWNCASTING => Casting da superclasse para superclasse
		//instanceof testa se é um objeto de um tipo
		//Exemplo: objeto instanceof NomeClasse 
		//Uso comum: métodos que recebem parametros genericos (Equals)
		BusinessAccount bacc4 = (BusinessAccount) acc2; //Cast Manual
		bacc4.loan(100);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3; //Permite compilar, mas erro na execução
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update Balance");
		}
		
		acc.withdraw(200);
		System.out.println(acc.getBalance());

		Account acc6 = new SavingsAccount(1009,"Maria",2000.0,0.01);
		acc6.withdraw(200);
		
		System.out.println(acc6.getBalance());
		
		Account acc7 = new BusinessAccount(1010,"Maria",2000.0,200.0);		
		acc7.withdraw(200);
		
		System.out.println(acc7.getBalance());
		
		
	}

}
