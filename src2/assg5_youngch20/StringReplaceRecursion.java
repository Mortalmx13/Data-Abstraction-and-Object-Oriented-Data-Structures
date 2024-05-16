package assg5_youngch20;
//Charles Young YOUNGCH20
import java.util.Scanner;

public class StringReplaceRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		 * different options to pick from
		 */
		System.out.println("1. Test replace method ");
		System.out.println("2. Test replaceAll method  ");
		System.out.println("3. Exit  ");
		int input = scan.nextInt();
		while(input>0 && input <3) {
		/**
		 * lets the user pick between 3 options
		 */
			if(input==1) {
				 System.out.println("Enter the input string, old character, new character");
	                scan.nextLine(); 
	                String str = scan.nextLine(); 
	                Character oldChar = scan.next().charAt(0); 
	                Character newChar = scan.next().charAt(0); 
	                System.out.println("Output String : "+replace(str, oldChar, newChar));
			}else if( input == 2){
                System.out.println("Enter the input string, old character, new character");
                scan.nextLine();
                String str = scan.nextLine(); 
                Character oldChar = scan.next().charAt(0); 
                Character newChar = scan.next().charAt(0); 
                
                System.out.println("Output : "+replaceAll(str, oldChar, newChar));
			}
				
				System.out.println("1. Test replace method ");
				System.out.println("2. Test replaceAll method  ");
				System.out.println("3. Exit  ");
				input = scan.nextInt();
				
			
		}
	}
	/**
	 * 
	 * @param str
	 * @param oldChar
	 * @param newChar
	 * @return
	 * replace method
	 */
	public static String replace(String str, Character oldChar, Character newChar) {
		if(str.equals(null) ||str.equals("")) {
			return str;
		}else if(oldChar.equals(str.charAt(0))){
			return newChar+ str.substring(1);
		}else {
			return str.charAt(0) + replace(str.substring(1), oldChar, newChar);
		}
		
	}
	/**
	 * @param str
	 * @param oldChar
	 * @param newChar
	 * @return
	 * replaceAll method
	 */
	public static String replaceAll(String str, Character oldChar, Character newChar) {
		if (str.length() < 1)
	        return str;
	    if (str.charAt(0) == oldChar) {
	        str = newChar + str.substring(1);
	    }
	    System.out.println(str);
	return str.charAt(0) + replace(str.substring(1, str.length()), oldChar, newChar);
	   
	}

	
	
}
