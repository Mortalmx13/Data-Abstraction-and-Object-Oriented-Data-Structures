package Practice_002;

public class LinkedListPractice1 {

	public static void main(String[] args) {
		Node head;
		head = new Node(20);
		Node node1 = new Node(15);
		head.next = node1;
		Node node2 = new Node(10);
		head.next = node2;
		Node node3 = new Node(5);
		head.next = node3;
		
		Node curr;
		curr = head;
		while(curr != null) {
			System.out.println(curr.item);
			curr = curr.next;
		}
	}

}
