package list;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyList sl=new SinglyList();
//		Customer c= new Customer("abc", 21, "Pune", 1);
//		sl.display();
//		sl.addlast(c);
//		sl.display();
		
		Scanner sc= new Scanner(System.in);
		int choice ,val;
		do {
			System.out.println("\n 0.Exit 1.Add 2.Display");
			System.out.println("Enter choice");
			choice =sc.nextInt();
			switch(choice) {
			case 1: //add
				
				System.out.println("Enter custome details : name,age,address,id");
				Customer c= new Customer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
				sl.addlast(c);
				break;
			case 2: //display
				sl.display();
				break;
			
			}
			
		}while(choice!=0);
		

	}

}
