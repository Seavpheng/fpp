package prog9_1; 

public class MyStack { 
	private MyStringLinkedList list;
	
	public MyStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() { 
		int size = list.size();
		if(size <=0 ) {
			return null;
		}
		String s = list.get(size -1);
	  	list.remove(size -1);  
		return s;
	}
	
	public String peek() {
		int size = list.size();
		return list.get(size-1); 
	}
	
	public void push(String s) { 
		list.add(s); 
	}
	
	 
}
