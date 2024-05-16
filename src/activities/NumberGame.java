//student: Charles Young Banner ID:B01322883
package activities;

	import java.util.Random;
	import java.util.Scanner;
	public class NumberGame {
		
		public static void main(String[] args) {
		    
		    Random r = new Random();
		    //sets 0 as the lowest possible number
		    int Low = 0;
		    //sets 99 as the highest number possible
		    int High = 99;
		    //generates numbers between 0 and 99
		    int Result = r.nextInt(High-Low) + Low;

		   
		     int num = 0;

		    //prints out intro to the game
		    System.out.println("Guess a number between 0 and 99");
		    System.out.println(" ");
		    System.out.print("What is your guess: ");
		    System.out.println(" ");

		    
		    Scanner scan = new Scanner(System.in);

		    
		    while(num <= 0) {
		        // allows the user to enter their guess
		            int number = scan.nextInt();
		        if (number == Result) { //this is what happens when the user guesses right within 5 tries
		            System.out.println("Correct! " );
		            System.out.println("Game over, YOU WON!");
		            num++;
		            break;
		        }
		        else if (number < Low || number > High) { //reminds the user of the guessing range
		            System.out.println("Remember that the range is between " + Low + " though " + High);
		            System.out.println("Guess again...");
		        }
		        else if (number < Result) { //tells the user if the guess it too small
		            System.out.println("Your guess is too small. Guess again.");

		        }
		        else if (number > Result ) { //tells the user is the guess is too large
		            System.out.println("Your guess is too big. Guess again.");

		        }
		       

		}

		}
	}