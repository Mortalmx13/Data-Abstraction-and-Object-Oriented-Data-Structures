package activity5;
//3014
import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
String userInput;
		
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter a string");
		userInput = scannerObject.nextLine();
 
		try {
			if(userInput.length()<=0) {
				throw new EmptyStringException("Enter a string that isnt empty");
				
			}else {
				System.out.println(userInput.toUpperCase());
			}
			
		}
		catch(EmptyStringException e) {
			System.out.println(e.getMessage());
			System.exit(1);
			}
		return;
		
		}
	
	

	}


