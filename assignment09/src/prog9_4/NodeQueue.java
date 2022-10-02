package prog9_4;
 

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head ;

	/* stores the element at the end of the queue, if it exists */
	private Node tail;

	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		// Create a new LL node
		Node temp = new Node(s);
		
		if(isEmpty()) {
			head = temp;
		}
		else {
			tail.next = temp;
		}
		tail = temp;
		
		 
	}

	/**
	 * Removes node from the front of the queue and returns its value if head is n
	 */
	public String dequeue() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue is empty!");
		}
		
		Node tmp = head; 
		head = head.next; 
		return tmp.data; 
	}

	/**
	 * Returns value stored at the front of the queue
	 * 
	 * @return
	 */
	public String peek() {
		if (isEmpty()) {
			
			return null; 
		}
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	} 

}
