package list;

public class SinglyList {
	private Node head;

	public SinglyList() {
		super();
		this.head = null;
	}

	public void display() {
		Node trav = head;

		while (trav != null) {
			System.out.println(trav.getStud());
			trav = trav.getNext();
		}
		// System.out.println("");
	}

	public void addAtLast(Student stud) {
		Node nn = new Node(stud);
		Node trav = head;

		if (head == null) {
			head = nn;
		}
		else {
			while (trav.getNext() != null) {
				trav = trav.getNext();
				trav.setNext(nn);
			}
		}

	}

}
