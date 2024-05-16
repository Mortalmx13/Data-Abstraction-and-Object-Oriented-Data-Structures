package activity5;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		int userInput;
		
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter an integer");
		userInput = scannerObject.nextInt();
 
		try {
			System.out.println(squared(userInput));
	
		}
		catch(NegativeNumberException a) {
			System.out.println(a.getMessage());
			System.exit(1);
			}
		scannerObject.close();
		}
	
	

public static double squared(int num) throws NegativeNumberException {
	if (num<0) {
		throw new NegativeNumberException("cant square less than zero");
		
	}else {
		return Math.sqrt(num);
	}
}
}

	