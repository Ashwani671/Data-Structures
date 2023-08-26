package singly;

import singly.Customer;
import singly.Node;

public class SinglyList {

	private Node head;

	public SinglyList() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}

	public void display() {

		Node trav = head;
		while (trav != null) {
			System.out.println(trav.getCust());
			trav = trav.getNext();
		}
	}

	public void insert(Customer cust) {
		Node nn = new Node(cust);
		Node trav = head;
		
		if(head== null) {
			head= nn;
			return;
		}
		else {
			while(trav.getNext()!=null) {
				trav=trav.getNext();
				trav.setNext(nn);
				return;
			}
		}

	}
	

}
