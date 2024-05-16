//student: Charles Young Banner ID:B01322883
package activity1;

public class RationalNum {


	   private int Numerator;
	   private int Denominator;
	   
	   public RationalNum() {
		   Numerator = 0;
		   Denominator = 1;
		   
	   }
	
	   public RationalNum (int Numerator) {
		   this.Numerator = Numerator;
		   Denominator = 1;
	   }
	
	   public RationalNum(int Numerator , int Denominator) {
		   
		   if(Denominator < 0) {
			   this.Numerator = -1*Numerator;
			   this.Denominator = -1*Denominator;
		   }
		   else {
			   this.Numerator = Numerator;
			   this.Denominator = Denominator;
		   }
		   
		   if(Denominator == 0) {
			   System.out.println("Zero cannot be in the denominator");
		   }
		   
		   
		   
	   }
	   public String toString() {
		   return "(" + Numerator + "/" + Denominator + ")";
		   
	   }
	   
	   public int getNumerator() {
		   
		   return Numerator;
	   }
	public int getDenominator() {
		
		return Denominator;
	}
	//addition
	public RationalNum add (RationalNum frac) {
		
		int newNum = ((this.getNumerator() * frac.getDenominator() + (this.getDenominator() * frac.getNumerator())));
		int newDon = (this.getDenominator() * frac.getDenominator());
	
	return new RationalNum(newNum,newDon);
	
	}
	
	//subtraction 
	public  RationalNum sub (RationalNum frac) {
		
		int newNum = ((this.getNumerator() * frac.getDenominator() - (this.getDenominator() * frac.getNumerator())));
		int newDon = (this.getDenominator() * frac.getDenominator());
	
	return new RationalNum(newNum,newDon);
	
		
	}
	//multiplication
public RationalNum mul(RationalNum frac) {
		
		int newNum = (this.getNumerator() * frac.getNumerator());
		int newDon = (this.getDenominator() * frac.getDenominator());
		
		return new RationalNum(newNum,newDon);
	}
	//division
	public RationalNum div(RationalNum frac) {
		
		int newNum = (this.getNumerator() * frac.getDenominator());
		int newDon = (this.getDenominator() * frac.getNumerator());
		
		return new RationalNum(newNum,newDon);
	}
	//negative
	public RationalNum neg(RationalNum frac) {
		
		int newNum = (-this.getNumerator());
		int newDon = (this.getDenominator());
		
		return new RationalNum(newNum,newDon);
	}
	//test for equality
	public boolean equals(Object e) {
		
		if(e == null) {
			return false;
		}
		
		if(e instanceof RationalNum) {
			
			RationalNum frac = (RationalNum)(e);
			return ((this.getNumerator() * frac.getDenominator())) == (frac.getNumerator() * this.getDenominator());
			
		}
		else {
			return false;
		}
		
	}
	
	
	
}
