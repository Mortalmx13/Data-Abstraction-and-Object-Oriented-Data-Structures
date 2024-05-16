package activity1;

import java.util.Scanner;

public class SentenceProcessor {

	public static void main(String[] args)
    {
		 Scanner scannerObject = new Scanner(System.in);
	        System.out.println("Enter a sentence");
	        String userInput = scannerObject.nextLine();
	        int inputLength = userInput.length();
	        char positionEnd = userInput.charAt(userInput.length()-1);
	        
	        switch (positionEnd) {
	        case '?':
	        	if(inputLength %2 == 0) {
	        		System.out.println("That's an even question");
	        		break;
	        	}
	        	else {
	        		System.out.println("That's an odd question");
	        		break;
	        	}
	        case '!':
	        	System.out.println("WoW!");
	        	break;
	        case ',':
	        	System.out.println("More to come!");
	        	break;
	        	default:
	        		System.out.println("You always say " + userInput);
		        	break;
	        		
	        }
    }
	
}
