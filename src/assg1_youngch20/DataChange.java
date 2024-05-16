package assg1_youngch20;
/**
 * Charles Young
 */
import java.util.Scanner;

public class DataChange {

	public static void main(String[] args) {
		System.out.println("Enter a date in this format month/day/year:");
		Scanner scan = new Scanner(System.in); 
		String userInput = scan.next(); // gets user input
		int pos1 = userInput.indexOf("/");
		int pos2 = userInput.lastIndexOf("/"); // gets the position of the 2 /'s
		String mon = userInput.substring(0, pos1);
		String day = userInput.substring(pos1+1, pos2);
		String year = userInput.substring(pos2+1, userInput.length());
		System.out.println(day+ "."+ mon+"."+ year); // prints out the new date
	}

}
