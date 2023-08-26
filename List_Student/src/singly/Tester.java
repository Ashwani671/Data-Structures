package singly;

import java.util.Scanner;

import singly.Singy1.Student;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singy1 s = new Singy1();
		int pos,val,choice=0;
	Scanner sc=new Scanner(System.in);	
		do {
		System.out.println("1.display 2.add ");
		System.out.println("Enter choice");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : s.display();
		break;
		case 2 : System.out.println("Enter the details of student");
		//int id, String name, String email, String password
			Student s1 = new Student(sc.nextInt(), sc.next(),sc.next(), sc.next());
			
			s.insert(s1);
		
		
		}
		
		}while(choice!=0);

	}

}
