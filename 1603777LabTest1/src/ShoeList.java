//Davian Lounds | 1603777 | 19/02/2020
public class ShoeList {
	private Node head;

	public ShoeList() {
		head = null;
	}
	
	public ShoeList(Node head) {
		super();
		this.head = head;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			System.out.println("List is empty");
			return true;
		} else {
			System.out.println("List is not empty");
			return false;
		}
	}
	
	public boolean isFull() {
		Node temp = new Node();
		return true;
	}	
	
	public boolean insert(Shoe Item) {
	if(isFull()) {
		System.out.println("List is full");
		return false;
	} else {
		Node nextItem = new Node();
		nextItem.setData(Item);
		if(isEmpty()) {
			head = nextItem;
		} else {
			Node current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(nextItem);
		}
		return true;
		}
	}
	
	
	public void retrieve() {
		if(isEmpty()) {
			System.out.println("Unable to locate any data in the list");
		} else { 
			
		}
	}
	
	
	public Shoe remove() {
		if(!isEmpty()) {
			Shoe  data = head.getData();
			Node itemToDelete = head;
			head = head.getNext();
			itemToDelete = null;
			
			return data;
		}
		return null;
	}
	
	public void show() {
		if(!isEmpty()) {
			System.out.println("Nothing to display, list is empty");
		} else {
			while(head.getNext() != null) {
				head.display();
			}
		}
	}
	
	public void destroy() {
		if(!isEmpty()) {
			while(head != null) {
				Shoe  data = head.getData();
				Node itemToDelete = head;
				head = head.getNext();
				itemToDelete = null;
			}
			System.out.println("List has been deleted");
		}
	}

}