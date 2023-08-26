package SinglyList;

import java.util.Scanner;

public class Singly {
	public static class Node {
		private int data;
		private Node next;

		public Node() {
			// TODO Auto-generated constructor stub
			this.data = 0;
			next = null;
		}

		public Node(int val) {
			this.data = val;
			next = null;
		}
	}

	private Node head;

	public Singly() {
		head = null;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("List:");
		Node trav = head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void addFirst(int val) {
		Node nn = new Node(val);
		nn.next = head;
		head = nn;
	}

	public void addLast(int val) {
		Node nn = new Node();
		if (head == null) {
			head = nn;
		}
		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
			trav.next = nn;
		}
	}

	public void addAtPos(int val, int pos) {
		if (head == null || pos <= 1) {
			addFirst(val);
		} else {
			Node nn = new Node();
			Node trav = head;
			for (int i = 0; i < pos - 1; i++) {
				if (trav.next == null) {
					break;

				}
				trav = trav.next;
				trav.next = nn;

			}
		}
	}
	
	public void deleteAll() {
		head=null;
	}
	public void deleteFirst() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int choice=0,val;
		do {
		System.out.println("0 Exit \n 1.");
		}while(choice!=0);
	}

}
