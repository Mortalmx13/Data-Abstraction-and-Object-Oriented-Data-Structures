package assg1_youngch20;

//Charles Young YOUNGCH20

import java.util.Scanner;

public class ColorFinder {

	public static void main(String[] args)
    {
	 Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String userInput = scannerObject.nextLine();
        String searchR = "Red";
        String searchY = "yellow";
        String searchB = "blue";
        String searchC = "cyan";
        String searchM = "magenta";
        String searchG = "green";
        //red,green,blue
        //magenta, yellow, and cyan
        
        
     // System.out.println(userInput);
        
      if ( userInput.toLowerCase().indexOf(searchR.toLowerCase()) != -1 ) {

    	   System.out.println("Additive primary color found");

    	} 
      else if(userInput.toLowerCase().indexOf(searchB.toLowerCase()) != -1 ) {
    	  System.out.println("Additive primary color found");
      }
      else if(userInput.toLowerCase().indexOf(searchG.toLowerCase()) != -1 ) {
    	  System.out.println("Additive primary color found");
      }
      else if(userInput.toLowerCase().indexOf(searchY.toLowerCase()) != -1 ) {
    		System.out.println("Subtractive primary color found");
    	}
    	else if(userInput.toLowerCase().indexOf(searchC.toLowerCase()) != -1 ) {
    		System.out.println("Subtractive primary color found");
    	}
    	else if(userInput.toLowerCase().indexOf(searchM.toLowerCase()) != -1 ) {
    		System.out.println("Subtractive primary color found");
    	}
      
      else {

    	   System.out.println("No primary colors found");

    	}
       
    }
	
}
