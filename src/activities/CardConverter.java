package activities;

import java.util.Scanner;
public class CardConverter {

	
		
		 public static void main(String[] args) {
		        Scanner kbd = new Scanner(System.in);

		       
		        String userinput;

		     



		        System.out.print("Input 2-3 characters from the following: A, C, D, E, H, J, K, Q, S, 2, 3, 4, 5, 6, 7, 8, 9, 10: ");
		        userinput = kbd.next().toUpperCase();

		        switch (userinput){

		        case "AH": 
		            System.out.println("Ace of Hearts");
		            break;
		        case "QS":
		            System.out.println("Queen of Spades");
		            break;
		        case "7C":
		            System.out.println("7 of Clubs");
		            break;
		        case "10D":
		            System.out.println("10 of Diamonds");
		            break;
		        case "KC":
			        System.out.println("King of Clubs");
			        break;
		        case "JS":
		            System.out.println("Jack of Spades");
		            break;

		        }
		        kbd.close();
		    }
		}
