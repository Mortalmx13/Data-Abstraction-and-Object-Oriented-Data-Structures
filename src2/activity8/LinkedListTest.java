package activity8;



public class LinkedListTest {

	public static void main(String[] args) {
		System.out.println("OddElementsIterative:");
		for(int i = 0; i<10;i++) {
			Node headList = new Node(i);
			oddElementsIterative(headList);
			
		}
		System.out.println("OddElementsRecursive:");
		for(int j = 0; j<10;j++) {
			Node headList = new Node(j);
			oddElementsRecursive(headList);
			
		}
		System.out.println("EvenElementsIterative:");
		for(int k = 0; k<10;k++) {
			Node headList = new Node(k);
			evenElementsIterative(headList);
			
		}
		System.out.println("EvenElementsRecursive:");
		for(int m = 0; m<10;m++) {
			Node headList = new Node(m);
			evenElementsRecursive(headList);
			
		}
		
		
	}
	
	public static void oddElementsIterative (Node list) {
		
		while (list != null) {
			if(list.item % 2 == 1) {
				System.out.println(list.item);
			}
			list = list.next;
		}
	}
public static void oddElementsRecursive (Node list) {
	if(list != null) {
		if(list.item % 2 == 1) {
			System.out.println(list.item);
		}
		if(list.next != null) {
			
			oddElementsRecursive(list.next);
		}
	}
	}
public static void evenElementsIterative (Node list) {
	
	while (list != null) {
		if(list.item % 2 == 0) {
			System.out.println(list.item);
		}
		list = list.next;
	}
}

public static void evenElementsRecursive (Node list) {
	if(list != null) {
	if(list.item % 2 == 0) {
		System.out.println(list.item);
	}
	if(list.next != null) {
		
		evenElementsRecursive(list.next);
	}
}
}
}


