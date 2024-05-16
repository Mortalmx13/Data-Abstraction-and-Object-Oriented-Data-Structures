package assg7_youngch20;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String exp = "";
while(!exp.equals("exit")) {
	
	System.out.println("Enter an expresssion or exit to end:");
exp = scan.nextLine();
		
		
		if (exp.equals("exit")) {
			System.exit(0);
		}
		else {
			Calculator obj = new Calculator(exp);
			System.out.println("Infix Expression : "+ exp);
			System.out.println("Postfix Expression : "+obj.getPostfix());
			System.out.println("Postfix Expression Evaluate: "+obj.evaluate());
			System.out.println();
			System.out.println("Enter an expresssion or exit to end:");
			exp = scan.nextLine();
		}
}
		
		scan.close();
	}
	}

		