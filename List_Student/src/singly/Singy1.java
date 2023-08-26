package singly;

public class Singy1 {
	static class Student{
		public int id;
		public String  name;
		public String  email;
		public String password;
		public Student(int id, String name, String email, String password) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
	}
	
	static class Node {
		public  Node next;
		public Student s;
		public Node(Student s) {
			super();
			this.s = s;
			next = null;
		}
		
		
		
		
	}

	
	private Node head;
	public Singy1() {
		head = null;
	}
	
	public void display() {
		Node trav = head;
		while(trav!= null) {
			System.out.println(trav.s);

			trav = trav.next;
		}
	}

	public void insert(Student s2) {
		// TODO Auto-generated method stub
		
	Node newNode = new Node(s2);
	newNode.next = head;
	head = newNode;
	}
	
	}

