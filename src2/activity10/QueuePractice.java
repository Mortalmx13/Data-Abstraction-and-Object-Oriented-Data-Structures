package activity10;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class QueuePractice {

	public static void main(String[] args) {
		System.out.println("How many items are in the list: ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Node list =listGenerator(size);
		Node temp = list;
		while(temp != null) {
			System.out.print(temp.item+"\t");
			temp = temp.next;
		}
		System.out.println();
		queueTest(list);

	}
public static void queueTest(Node par) {
	ArrayDeque <Integer> que = new ArrayDeque <Integer>();
	while (par != null) {
		par.item = par.item *2;
		que.add(par.item);
		par = par.next;
	}
	Iterator<Integer> val = que.iterator();
	while(val.hasNext()) {
		System.out.print(val.next()+ "\t");
	}
	
}
public static Node listGenerator (int par) {
	Random rand = new Random();
	Node n = new Node(rand.nextInt(50));
	while(par > 1) {
		n.next = new Node (rand.nextInt(50),n.next);
		par--;
	}
	return n;
}
}
