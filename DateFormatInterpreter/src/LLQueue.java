
public class LLQueue<E> {
	
	private int size;
	private Node first, last;

	public LLQueue(){
		size = 0;
		first = last = null;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(E e) {
		if(isEmpty()) {
			first = new Node(e, null);
			last = first;
		} else {
			Node n = new Node(e, null);
			last.setNext(n);
			last = n;
		}
		size++;
	}
	
	public E dequeue() {
		if(isEmpty()) return null;
		E etr = (E) first.getElement();
		first = first.getNext();
		size--;
		return etr;
	}
	
	public E first() {
		return (E) first.getElement();
	}
	
	private class Node<E>{
		private E element;
		private Node next;
		
		public Node(E element, Node next) {
			this.element = element;
			this.next = next;
		}
		
		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
	
}
