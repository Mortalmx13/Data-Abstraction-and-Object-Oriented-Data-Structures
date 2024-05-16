package activity5;

public class EmptyStringException extends Exception {

	public EmptyStringException () {
		super("Enter a string that isnt empty");
	}
public EmptyStringException (String str) {
	super(str);
	}
	
	
	
}
