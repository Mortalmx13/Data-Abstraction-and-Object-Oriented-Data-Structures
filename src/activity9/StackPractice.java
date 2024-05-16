package activity9;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class StackPractice {

	public static Node listGenerator(int size ) {
		 

	     Random rand = new Random();    
	    var head = new Node(rand.nextInt(100));
	    Node tempHead = head;
		for(int i = 0;i<size;i++) {	
			var next = new Node(rand.nextInt(100));
			tempHead = head.next;
		}
		return head;
		
	}
public static void PrintLinkedList(Node head) {
	Node curr = head;
    while (curr != null) {
        System.out.print(curr + " ");
        curr = curr.next;
    }
    System.out.println();
}
	public static Stack<Integer> LinkedListToStack(Node head) {
		Stack<Integer> stack = new Stack<>();
		
		while(head != null) {
			stack.push(head.next);
			head = head.next;
		}
		return stack;
	}
	public static double avgOfNumbersInStack(Stack<Integer> stack) {
        int sum = 0;
        int count = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
            count++;
        }
        return (double) sum / count;
    }
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the linked list: ");
	        int size = sc.nextInt();

	        Node head = listGenerator(size);
	        System.out.print("The numbers in the linked list: ");
	        PrintLinkedList(head);

	        Stack<Integer> stack = LinkedListToStack(head);
	        double avg = avgOfNumbersInStack(stack);
	        System.out.printf("The average of numbers in the stack: ", avg);
	    }
	
}
