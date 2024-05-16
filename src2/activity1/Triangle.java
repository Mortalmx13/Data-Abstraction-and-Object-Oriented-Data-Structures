package activity1;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args)
    {
		
		System.out.println( "Enter a number:");
        Scanner scannerObject = new Scanner(System.in);
       int userInput = scannerObject.nextInt();
     
    printTriangle(userInput,1);
    }
	
	public static void printLine(int num) {
		
		if (num == 0)
			return;
		System.out.print('*');
		printLine(num-1);
			
		
		
	}
	public static void printTriangle(int j, int i) {
		
		if (j == 0)
			return;
		printLine(i);
		System.out.println();
		printTriangle(j-1,i+1);
		

	}
}
