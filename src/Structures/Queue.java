package Structures;

public class Queue {

	private QueueNode front, rear;
	
	public Queue() {
		front=rear=null;
	}
	
	
	public boolean empty() {
		return(front==null);
	}
	
	public void print() {
		if(this.empty()) {
			System.out.println("Fila Vazia!");
		}else {
			System.out.println("|---Inicio---|");
			QueueNode itr = front;
			
			while(itr!=null) {
				System.out.println(itr.element.toString());
				itr=itr.next;
			}
		
			System.out.println("|---Fim---|");
			
		}
		
	}
	
	public void enqueue(Object item) {
	    QueueNode newNode = new QueueNode(item, null);
	    if (empty()) {
	        front = rear = newNode;
	    } else {
	        rear.next = newNode;
	        rear = newNode;
	    }
	}

	public Object dequeue() {
	    if (empty()) {
	        System.out.println("Fila Vazia!");
	        return null;
	    }
	    Object removedElement = front.element;
	    front = front.next;
	    if (front == null) {
	        rear = null;
	    }
	    return removedElement;
	}
	
	
	private class QueueNode {
		
		private Object element;
		private QueueNode next;
		
		
		private QueueNode (Object e, QueueNode n) {
			element=e;
			next=n;
		}
			
	}
	
}
