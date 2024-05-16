package activity5;

public class NegativeNumberException extends Exception {

	public NegativeNumberException () {
		super("Can't enter less than zero");
	}
public NegativeNumberException (String number) {
	super(number);
	}
	
	
	
}
