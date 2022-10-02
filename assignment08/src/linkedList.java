
public class linkedList {
	static class Node{
		int data;
		Node next;
		Node pre;
	}
	
	static Node start = null;
	
	static void insert(int data) {
		if(start == null) {
			Node new_node = new Node();
			new_node.data = data;
			new_node.next = new_node.pre = new_node; 
			
			start =new_node;
			
			return ;
		}
		
		Node last = (start).pre;
		
		Node new_node = new Node();
		new_node.data = data;
		
		new_node.next = start;
		new_node.pre = last;
		
		last.next = (start).pre = new_node;
		
		start = new_node;
	}
	
	public static void display() 
	{
		Node tmp = start;
		while(tmp.next != start) {
			System.out.print(tmp.data);
			
			tmp = tmp.next;
		}
		System.out.printf("%d ", tmp.data);
	}
	
	public static void main(String [] arg) {
		insert(4);
		
		insert(5);
		
		insert(7);
		
		display();
		
		//System.out.print(start.next.next.next.data);
	}
}
