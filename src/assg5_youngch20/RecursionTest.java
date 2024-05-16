/**
 * Charles Young
 */
package assg5_youngch20;

import java.util.Scanner;

public class RecursionTest {
	
	/**
	 * this runs the two par recursive and execute it
	 * @param str
	 * @param startIndex
	 * @return
	 */
	 public static String substringRecursive(String str, int startIndex) {
	        if (startIndex == str.length()) {
	            return "";
	        }
	        char firstChar = str.charAt(startIndex);
	        String rest = substringRecursive(str, startIndex + 1);
	        return firstChar + rest;
	    }
	    /**
	     * this runs the three par recursive and execute it
	     * @param str
	     * @param startIndex
	     * @param endIndex
	     * @return
	     */
	    public static String substringRecursive(String str, int startIndex, int endIndex) {
	        if (startIndex == endIndex) {
	            return "";
	        }
	        char firstChar = str.charAt(startIndex);
	        String rest = substringRecursive(str, startIndex + 1, endIndex);
	        return firstChar + rest;
	    }
	
	
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int choice = 0;

	        while (choice != 3) {
	           Menu();
	            System.out.print("Enter your choice: ");
	            choice = scan.nextInt();
	            scan.nextLine();
			 switch (choice) {
			 case 1:
                 System.out.print("Enter input string: ");
                 String str1 = scan.nextLine();

                 System.out.print("Enter start index: ");
                 int start1 = scan.nextInt();

                 String result1 = substringRecursive(str1, start1);
                 System.out.println("Output string: " + result1);
                 break;
             case 2:
                 System.out.print("Enter input string: ");
                 String str2 = scan.nextLine();

                 System.out.print("Enter start index: ");
                 int start2 = scan.nextInt();

                 System.out.print("Enter ending index: ");
                 int end2 = scan.nextInt();

                 String result2 = substringRecursive(str2, start2, end2);
                 System.out.println("Output string: " + result2);
                 break;
			 }
		 }
	}
	/**
	 * prints the menu
	 */
public static void Menu() {
		
		System.out.println("1. Test two-parameter substringRecursive method ");
		System.out.println("2. Test three-parameter substringRecursive method ");
		System.out.println("3. Exit ");
		
		
	}
}
