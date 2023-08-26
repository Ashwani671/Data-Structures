package stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<Integer>(5);
//		st.push(52);
//		st.push(62);
//		st.push(95);
//		st.pop();
		System.out.println("insert:"+st.push(56));
		System.out.println("insert:"+st.push(45));
		System.out.println("insert:"+st.push(38));
		System.out.println("insert:"+st.push(85));
		System.out.println("delete:"+st.pop());

	}

}
