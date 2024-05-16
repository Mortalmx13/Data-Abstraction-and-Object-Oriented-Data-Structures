package activity9;

import java.util.Scanner;
import java.util.Stack;

public class StackPractice {

	public static String strRevStack(String str) {
		
        Stack<String> aStack = new Stack<String>();
        String [] split = str.split("");
        String back = null;
        String [] popped;
        popped = new String [str.length()];
        
        int count = 0;
        
        for(int i = 0; i< str.length(); i++) {
        	aStack.push(split[i]);
        }
        while(!aStack.empty()) {
        	popped[count] = aStack.pop();
        	count++;
        }
        StringBuilder stringB = new StringBuilder();
        for(Object obj : popped) {
        	stringB.append(obj.toString()).append("");
        }
        back = stringB.substring(0,stringB.length());
        return back;
	}
	public static void strRevIterative(String str) {
		for(int i = str.length() -1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	public static String strRevRecursive(String str) {
	if (str.length() == 0) {
		return str;
	}
	else {
		return strRevRecursive(str.substring(1))+ str.charAt(0);
	}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner scannerObject = new Scanner(System.in);
		String str = scannerObject.nextLine();
		System.out.println("strRevStack: "+strRevStack(str));
		System.out.println("strRevRecursive: "+strRevRecursive(str));
		System.out.print("strRevIterative: ");
		strRevIterative(str);
		
	}
	
}
