package activity1;

import java.util.Scanner;

public class friday1 {

	 public static void main(String[] args)
	    {
		 Scanner scannerObject = new Scanner(System.in);
	        System.out.println("Hello there.");
	        System.out.println("Enter a number!");
	        int n1;
	        double answer;
	        
	        n1 = scannerObject.nextInt( );
	        
	       answer = (n1-32)*5.0/9;
	        System.out.println("The tempature in Celsius is:");
	        System.out.println(answer);
	    }
	
	
}
