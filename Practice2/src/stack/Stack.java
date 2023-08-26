package stack;

public class Stack<T> {
	
	private int top;
	private int[] arr;
	private int size;
	
	public Stack(int size) {
		this.size=size;
		arr= new int [size];
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public int push(int data) {
		if(isFull()) {
			return -1;
		}
		arr[++top]=data;
		return  arr[top] ;
	}
	public int pop() {
		if(isEmpty()) {
			return -1;
		}	
		return arr[top--];
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}	
		return arr[top];
	}
}
