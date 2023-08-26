package singly;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		SinglyList sl=new SinglyList();
		int choice,val;
		do {
			System.out.println("\n 1.Add 2.Display 3.Exit");
			System.out.println("Enter choice");
			choice= sc.nextInt();
			switch(choice) {
			case 1: //add
				System.out.println("Enter Customer Details: id,name,address,age");
				Customer c= new Customer(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
				sl.insert(c);
				break;
			case 2: //display
				sl.display();
			}
		}while(choice !=0);
	}
}
