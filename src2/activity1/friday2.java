package activity1;

import java.util.Scanner;

public class friday2 {

	public static void main(String[] args)
    {
		System.out.println( "Enter text with at least 2 characters");
        Scanner scannerObject = new Scanner(System.in);
       String userInput = scannerObject.next();
        char position1 = userInput.charAt(0);
        char positionEnd = userInput.charAt(userInput.length()-1);
        String positionSub = userInput.substring(1,(userInput.length()-1));
        
        System.out.println("Position 1");
        System.out.println(position1);
        System.out.println("Position end");
        System.out.println(positionEnd);
        System.out.println("middle text");
        System.out.println(positionSub);
       
        
    }
	
}
//8014