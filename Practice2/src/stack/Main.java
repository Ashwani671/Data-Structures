package stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s=new Stack<Integer>(5);
		System.out.println("insert:"+ s.push(50));
		System.out.println("insert:"+ s.push(60));
		System.out.println("insert:"+ s.push(70));
		System.out.println("insert:"+ s.push(80));
		System.out.println("insert:"+ s.push(90));
		//System.out.println("insert:"+ s.push(100));
		System.out.println("delete:"+ s.pop());

	}

}
