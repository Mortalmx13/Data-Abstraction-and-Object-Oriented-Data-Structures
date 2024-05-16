package assg4_youngch20;
//Charles Young
public class StudentNotFoundException extends Exception{

	public StudentNotFoundException () {
		super("ther is no student found");
	}
public StudentNotFoundException (String str) {
	super(str);
	}
	
}
