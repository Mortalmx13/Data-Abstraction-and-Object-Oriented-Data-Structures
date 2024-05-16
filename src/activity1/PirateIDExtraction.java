package activity1;

import java.util.Scanner;

public class PirateIDExtraction {

	public static void main(String[] args) {
		System.out.println("Enter your email:  ");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		int pos = userInput.indexOf("@");
		String sentence = userInput.substring(0, pos);
		sentence = sentence.toUpperCase();
		System.out.println(sentence);
	}

}
