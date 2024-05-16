package assg1_youngch20;
/**
 * Charles Young
 */
import java.util.Scanner;

public class DigitReverse {

	public static void main(String[] args) {
		System.out.println("Please enter a non-negative integer (-1 to exit):");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();//gets user inputs
		if(userInput == -1){
			System.exit(1);
		}
		else{
				digitExtract(userInput);
				
			}
			scan.close();
		}
	public static void digitExtract(int digit) {
		int lastDig = 0;
		int reversed = 0;
		if(digit < 1){
			System.out.println(digit);
		}
		
			while(digit !=0){
				lastDig = digit %10;
				reversed = lastDig;
				digit /=10;
				System.out.println(reversed);
			}
			
	}

}
