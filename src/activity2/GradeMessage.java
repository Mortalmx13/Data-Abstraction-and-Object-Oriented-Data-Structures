package activity2;

import java.util.Scanner;
//6805
public class GradeMessage {

	public static void main(String[] args) {
		System.out.println("Enter a letter for a course:  ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		userInput = userInput.toLowerCase();
		char letter = userInput.charAt(0);
		
		
		message(letter);
	}
	
	public static void message(char letter) {
		
		
		switch(letter) {
		case 'a': System.out.println("Great job!");
				break;
		case 'b': System.out.println("Good job!");
				break;
		case 'c': System.out.println("You pass the course!");
				break;
		case 'd': System.out.println("Sorry, you have to retake the course.");
				break;
		case 'f': System.out.println("Sorry, you have to retake the course.");
				break;
			default: System.out.println("Invalid grade.");
				
		}
	}

}
