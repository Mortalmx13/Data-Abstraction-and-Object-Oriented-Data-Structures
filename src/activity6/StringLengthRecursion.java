package activity6;

import java.util.*;
public class StringLengthRecursion {
public static void main(String[] args) {
String str;
Scanner kbd = new Scanner(System.in);
System.out.println("Enter a string: ");
str = kbd.nextLine();
System.out.println("The length of the string you enter is: " + 
lengthRecursion(str));
kbd.close();
}
/**
 * This method uses recursion to calculate the length of a string
 * @param str The given string
 * @return The length of the string
 */
public static int lengthRecursion(String str) {
if ((str.equals("")) || (str == null))
return 0;
else {
return 1 + lengthRecursion(str.substring(1));
}
}
}