package activity10;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
//4397
//connell leon
public class PalindromeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String input;
		input = scan.nextLine()	;
		int option = 0;
		 Scanner enter = new Scanner(System.in);
			while(option!=9) {
			menu();
			option = enter.nextInt();
			switch(option) {
			case 1:
				if(isPalindromeUsingStack(input)) {
					System.out.println(input + " is a palindrome");
				}
				else {
					System.out.println(input + " is not a palindrome");
				}
				break;
			case 2:
				if(isPalindromeUsingStackAndQueue(input)) {
					System.out.println(input + " is a palindrome");
				}
				else {
					System.out.println(input + " is not a palindrome");
				}				
				break;
			case 3:
				if(isPalindromeRecursion(input)) {
					System.out.println(input + " is a palindrome");
				}
				else {
					System.out.print(input + " is not a palindrome");
				}				
				break;
			case 4:
				System.out.println("The string is a palindrome: " + isPalindromeIteration(input));
				break;
			}
			}
			}
	
	public static boolean isPalindromeUsingStack (String str) {
	Stack<Character> stack = new Stack<Character>();
	for (int i = 0 ; i <str.length();i++) {
		stack.push(str.charAt(i));
	}
	String reverse = "";
	while(!stack.isEmpty()) {
		reverse += stack.pop();
		
	}
	return str.equals(reverse);
	
}
	public static boolean isPalindromeUsingStackAndQueue(String test) {
		Stack<Character> pStack = new Stack<Character>();
		ArrayDeque<Character> pDeque = new ArrayDeque<Character>();
		
		for(int i = 0; i < test.length(); i++) {
			pStack.push(test.charAt(i));
			pDeque.addLast(test.charAt(i));
		}
		
		while(!pStack.isEmpty()) {
			if(pStack.pop() != pDeque.removeFirst()) {
				return false;
			}
		}
		if(!pDeque.isEmpty()) {
			return false;
		}
		return true;
	}
	public static boolean isPalindromeRecursion(String test) {
		System.out.println(test);
		if(test == "" || test == null) {
			return true;
		}
		 if (test.length() <= 1) {
		        return true;
		    } else if (test.charAt(0) != test.charAt(test.length() - 1)) {
		        return false;
		    } else {
	return	isPalindromeRecursion(test.substring(1, test.length() - 1)) ;
			
		}
	}
	public static boolean isPalindromeIteration (String str) {
		 int left = 0;
		    int right = str.length() - 1;
		    while (left < right) {
		        if (str.charAt(left) != str.charAt(right)) {
		            return false;
		        }
		        left++;
		        right--;
		    }
		    return true;
		}
public static void menu() {
	System.out.println("1. test isPalindromeUsingStack");
	System.out.println("2. test isPalindromeUsingStackAndQueue");
	System.out.println("3. test isPalindromeRecursion");
	System.out.println("4. test isPalindromeIteration");
}
}
