package cq;

public class Main {
	public static void main(String[] args) {
		
		CircularQueue cq= new CircularQueue(5);
		System.out.println("insert:"+ cq.push(25));
		System.out.println("insert:"+ cq.push(50));
		System.out.println("insert:"+ cq.push(75));
		System.out.println("insert:"+ cq.push(100));
		System.out.println("insert:"+ cq.push(200));
		System.out.println("insert:"+ cq.push(300));
		System.out.println("insert:"+ cq.push(400));
		System.out.println("insert:"+ cq.push(500));
		System.out.println("insert:"+ cq.pop());	
		
	}

}
