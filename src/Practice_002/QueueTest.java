package Practice_002;

import java.util.ArrayDeque;
import java.util.Iterator;

public class QueueTest {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		Iterator<Integer> iter;
		
		for (int i =0; i<10; i++) {
			queue.add(i);
		}

		iter = queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("Testing remove method.");
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
