package cq;

public class CircularQueue {

	private int size;
	private int[] arr;
	private int front, rear;

	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		front = rear = -1;
		arr = new int[size];
	}

	public boolean isEmpty() {
		return (front == rear && front == -1);
	}

	public boolean isFull() {
		return (front == rear && front != -1) || (front == -1 && rear == size-1);
	}

	public boolean push(int val) {
		if (isFull()) {
			throw new RuntimeException("Queue is Full");
		}
		rear = (rear + 1) % arr.length;
		arr[rear] = val;
		return true;

	}

	public int pop() {
		if (isEmpty())
			throw new RuntimeException("Queue is Empty");
		front = (front + 1) % arr.length;
		if (rear == front) {
			rear = -1;
			front = -1;
		}
		return rear;

	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("Queue is empty");
		int index = (front + 1) % arr.length;
		return arr[index];
	}

}
