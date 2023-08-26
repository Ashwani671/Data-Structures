package list;

public class SinglyList {
	private Node head;

	public SinglyList() {
		
		this.head = null;
	}
	
	
	public void display() {
		Node trav= head;
		while(trav!=null) {
			System.out.println(trav.getCust());
			trav=trav.getNext();
		}
	}
	
	public void addlast(Customer cust) {
		Node nn= new Node(cust);
		Node trav=head;
		if(head==null)
			head=nn;
		else {
			while(trav.getNext()!=null) {
				trav=trav.getNext();
				trav.setNext(nn);
			}
		}
	}
	
	

}
