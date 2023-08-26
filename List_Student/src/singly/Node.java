package singly;
import singly.Customer;
public class Node {
	
	private Customer cust;
	private Node next;
	
	public Node(Customer cust) {
		super();
		this.cust = cust;
		this.next = next;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
	

}
