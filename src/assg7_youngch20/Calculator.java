/**
 * Charles Young
 */
package assg7_youngch20;

import java.util.Stack;

/**
 * 
 * @author owner
 * calculates postfix for equations
 *
 */
public class Calculator {
	
	public String infix;
	public String postfix;
	
	/**
	 * constructor that sets the infix and postfix
	 * @param exp
	 */
	public Calculator(String exp) {
		
		this.infix = exp;
		this.postfix = "";
		this.convertPostfix();
		
	}
	
	/**
	 * @return returns the infix
	 */
	
	public String toString() {
		
		return infix;
		
	}
	
	/**
	 * Checks for parentheses and spaces and reorders the set so it is ready for the get statement
	 * @return returns the postfix equation
	 */
	private boolean convertPostfix() {
		String answer = "";
		Stack <Character> stack = new Stack <Character> ();
		for(int i = 0; i < infix.length(); ++i) {
			char ch = infix.charAt(i);
			if(Character.isDigit(ch)) {
				
				String temp = "";
				
				int count = i;
				
				while(count < this.infix.length() && Character.isDigit(this.infix.charAt(count))) {
					
					temp = temp + this.infix.charAt(count);
					count++;
				}
				i = count - 1;
				answer = answer + temp + " ";
			}
			
			else if (ch == '(') {
				stack.push(ch);
			}
			
			else if (ch == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {	
					answer = answer + stack.peek();
					stack.pop();
				}
				stack.pop();
			}
			
			else if (ch != ' ') {
				while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {	
					answer = answer + stack.peek();
					stack.pop();	
				}
				stack.push(ch);	
			}}
		
		while(!stack.isEmpty()) {
			
			if(stack.peek() == '(') {
				return false;
			}
			answer = answer + stack.peek();
			stack.pop();
		}
		this.postfix = answer;
		return true;
	}
	
	
	/**
	 * 
	 * @return gets the postfix equation and checks if its illegal
	 * @throws IllegalStateException
	 */
	public String getPostfix() throws IllegalStateException {
		
		if(this.convertPostfix()) {
			
			return this.postfix;	
		}
		else {
			throw new IllegalStateException("Expression failed");
		
		}
	}
	
	/**
	 * 
	 * @return evaluates the problem and checks the order so the calculations is right
	 * @throws IllegalStateException
	 */
	public double evaluate() throws IllegalStateException {
		
		if(postfix.equals("")) {
			throw new IllegalStateException();
		}
		
		Stack <Double> stack = new Stack <Double> ();
		for(int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);
			if(Character.isDigit(ch)) {
				int count;
				String temp = "";	
				 count = i;
				while(count < this.postfix.length() && Character.isDigit(this.postfix.charAt(count))) {
					
					temp = temp + this.postfix.charAt(count);
					count ++;
					
				}
				i = count -1;
				stack.push(Double.parseDouble(temp));
			}
			
			else if(ch == ' ') {
			
			}
			
			else {
				double v1 = stack.pop();
				
				double v2 = stack.pop();
				
				switch (ch) {
					case '+':
						stack.push(v2 + v1);
						break;
					case '–':
						stack.push(v2 - v1);
						break;
					case '/':
						stack.push(v2 / v1);
						break;
					case '*':
						stack.push(v2 * v1);
						break;
					case '^':
						stack.push((double)Math.pow(v1,  v2));
						break;
				}}}
		return stack.pop();	
		
	}
	
	
	/**
	 * 
	 * @param oper
	 * @return gets the different symbols that is in mathematics 
	 */
	private int precedence(Character oper) {
		
		switch (oper) {
		
			case '+':
			case '-':
				return 0;
			case '*':
				return 1;
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return -1;
	}

}
