package activity1;
//1314
import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		 int celsius = 0;
		 double answer;
		System.out.println("Enter a temp: ");
		Scanner scan = new Scanner(System.in);
		
		celsius = scan.nextInt();
		
		 answer = ((celsius *  9.0/5) + 32);
		
		System.out.println(answer);
	}

}
