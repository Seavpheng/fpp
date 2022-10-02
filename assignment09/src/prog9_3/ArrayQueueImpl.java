package prog9_3;

import java.util.AbstractCollection; 
import java.util.Deque;
import java.util.Iterator;

public class ArrayQueueImpl  {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	 
	ArrayQueueImpl(){
		 front = this.size = 0;
		 rear = arr.length - 1; 
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public boolean isFull() {
		return size == arr.length;
	}
	
	
	public int size() {
		return size;
	}
	
	public void enqueue(int e) 
	{
		if(isFull()) {
			 resize();
		}
		
		this.rear = (this.rear +1) % arr.length; 
		arr[rear] = e;
		size++;
	}
	
	public int dequeue()
	{
		if(isEmpty()) return -1;
		
		int result = arr[front]; 
		front = (front +1 ) % arr.length;
		size--;
		return result;
				
	}
	
	int front() {
		if(isEmpty())
			return -1;
		
		return arr[front];
	}
	
	public int peek()
	{
		if(isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
		
		return arr[rear];
	}
	
	private void resize(){ 
		int len = arr.length;
		int newlen = 2*len;
		int[] temp = new int[newlen];
		System.arraycopy(arr,0,temp,0,len);
		arr = temp;
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 100; i++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}

	
}

