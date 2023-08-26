package list;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyList sl = new SinglyList();

		Scanner sc = new Scanner(System.in);

		int choice, val;
		do {
			System.out.println("\n 0.Exit 1.Add 2.Display");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // add
				System.out.println("ENter student details: id,name,address,age,course");
				Student st = new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
				sl.addAtLast(st);
				break;
			case 2: // display
				sl.display();
				break;
			}

		} while (choice != 0);
		sc.close();
	}

}
