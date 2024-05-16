package activity6;
//
import java.util.Scanner;

public class RecursionPractice {
	public static void main(String[] args) {

		String str;
		
		Scanner kbd = new Scanner(System.in);
		//asks user to enter a string
		System.out.println("Enter a string: ");
		str = kbd.nextLine();
		
		String odd = oddString(str);
		String even = evenString(str);
		
			//odd
			System.out.println("Odd: "+odd);
		
			//even
			System.out.println("Even: "+even);
		

	}
	public static String oddString(String str) {
		if ((str==null) || (str.equals("")))
			return str;
		else if (str.length()==1)
			return "";
		else
			return str.charAt(1)+oddString(str.substring(2));
		
		
	}
	public static String evenString(String str) {
		if ((str==null) || (str.equals("")))
			return str;
		else if (str.length()==1)
			return ""+str.charAt(0);
		else
			return str.charAt(0)+evenString(str.substring(2));
		
	}
}
