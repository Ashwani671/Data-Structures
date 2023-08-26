package list;
import list.Customer;

public class Node {
	
	private Customer cust;
	private Node next;
	
	public Node(Customer cust) {
		super();
		this.cust = cust;
		this.next = null;
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
