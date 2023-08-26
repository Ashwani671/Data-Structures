package stack;

public class Stack <T>{
	
	private int size;
	private int top;
	private int[]arr;
	
	public Stack(int size) {
		// TODO Auto-generated constructor stub
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	
	public boolean isFull()
	{
		return top==arr.length-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public int push(int data) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		arr[++top]=data;
		return arr[top];
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty");	
		}
		return arr[top--];
	}
	
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return arr[top];
	}
}
