//student: Charles Young Banner ID:B01322883
package activity1;

public class RationalNumDemo {

	public static void main(String [] args) {
		
		RationalNum frac1 = new RationalNum ();
		RationalNum frac2 = new RationalNum (3,4);
		RationalNum frac3 = new RationalNum (5,6);
		RationalNum frac4 = new RationalNum (9);
		RationalNum frac5 = new RationalNum (2,-3);
		RationalNum frac6 = new RationalNum (5,8);
		
		
		System.out.println("Fraction number 1 is: " + frac1.toString());
		System.out.println("Fraction number 2 is: " + frac2.toString());
		System.out.println("Fraction number 3 is: " + frac3.toString());
		System.out.println("Fraction number 4 is: " + frac4.toString());
		System.out.println("Fraction number 5 is: " + frac5.toString());
		System.out.println("Fraction number 6 is: " + frac6.toString());
		System.out.println("\n");
	//addition	
	System.out.println("The sum of fration 2 and 5 are: " + frac2.add(frac5));
	System.out.println("The sum of fration 1 and 4 are: " + frac1.add(frac4));	
	System.out.println("The sum of fration 3 and 6 are: " + frac3.add(frac6));	
	System.out.println("\n");	
	//subtraction	
	System.out.println("The subtraction of fration 2 and 5 are: " + frac2.sub(frac5));
	System.out.println("The subtraction of fration 1 and 4 are: " + frac1.sub(frac4));	
	System.out.println("The subtraction of fration 3 and 6 are: " + frac3.sub(frac6));	
	System.out.println("\n");	
	//multiplication
	System.out.println("The multiplication of fration 2 and 5 are: " + frac2.mul(frac5));
	System.out.println("The multiplication of fration 1 and 4 are: " + frac1.mul(frac4));	
	System.out.println("The multiplication of fration 3 and 6 are: " + frac3.mul(frac6));	
	System.out.println("\n");	
	//division
	System.out.println("The division of fration 2 and 5 are: " + frac2.div(frac5));
	System.out.println("The division of fration 1 and 4 are: " + frac1.div(frac4));	
	System.out.println("The division of fration 3 and 6 are: " + frac3.div(frac6));	
	System.out.println("\n");	
	//negative
	System.out.println("The negative of fration 1 is : " + frac1.neg(frac1));
	System.out.println("The negative of fration 2 is : " + frac2.neg(frac2));	
	System.out.println("The negative of fration 3 is : " + frac3.neg(frac3));
	System.out.println("The negative of fration 4 is : " + frac4.neg(frac4));
	System.out.println("The negative of fration 5 is : " + frac5.neg(frac5));
	System.out.println("The negative of fration 6 is : " + frac5.neg(frac5));
	System.out.println("\n");	
	//test for equality	
	System.out.println("Fraction 2 and 3 are equal true or false: " + frac2.equals(frac3));
	System.out.println("Fraction 1 and 4 are equal true or false: " + frac1.equals(frac4));	
	System.out.println("Fraction 3 and 5 are equal true or false: " + frac3.equals(frac5));	
	System.out.println("\n");	
		
		
		
		
		
		
	}
	
	
	
	
}
