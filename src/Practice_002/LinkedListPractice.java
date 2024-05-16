package Practice_002;

public class LinkedListPractice {

	public static void main(String[] args) {
		Node head;
		head = new Node(5);
		head = new Node(10,head);
		head = new Node(20,head);
		
		Node curr;
		curr = head;
		while(curr != null) {
			System.out.println(curr.item);
			curr = curr.next;
		}
	}

}
