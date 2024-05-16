package assg1_youngch20;
/**
 * Charles Young
 */
import java.util.Scanner;

public class CountGrades {

	public static void main(String[] args) {
		System.out.println("Enter number of grades  ");
		Scanner scan = new Scanner(System.in);
		int numOfGrades = scan.nextInt(); // gets the user input
		if (numOfGrades <= 0 ) {
			System.out.println("Invalid number --- Exit");
		}else {
			double[] arr = new double[numOfGrades];
			System.out.println("Enter " + arr.length + " Grades:");
			double sum = 0;
	        for (int index = 0; index < arr.length; index++)
	        {
	        	arr[index] = scan.nextDouble( );// arr of numbers 
	            sum = sum + arr[index];
	        }
	        double average = sum / arr.length; //formula for average
	        System.out.println("The average Grade is: " + average);
	        System.out.println("The Grades are Above average: ");
	        int aboveAvg = 0;
	        for (int index = 0; index < arr.length; index++) {
	        	
	        
	            if (arr[index] > average) {
	                System.out.println(arr[index]);
	                aboveAvg++;
	            }
	        }
	        System.out.println("For a total of "+ aboveAvg + " grades");//prints out average
		}
	
	}

}
