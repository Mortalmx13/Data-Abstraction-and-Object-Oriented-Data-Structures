package activities;

import java.util.Scanner;

public class ExceptionPractice {

	 public static void main(String[] args) {
	       

	       
	        int userinput = 0;

	        System.out.println("Enter a number: ");
	        Scanner kbd = new Scanner(System.in);
	        userinput = kbd.nextInt();
	        
	        if(userinput > 0) {
	        try {
	        	
	        	System.out.println("The average is: ");
	        	}
	        catch (NegativeNumberException e) {
	        	System.out.println(e.getMessage());
	        	System.exit(1);}
	        }
	 }
	
	
	
	 }

