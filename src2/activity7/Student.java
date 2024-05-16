package activity7;

public class Student {
String id;
String name;
String standing;
String major;
	
	public Student(String id,String name,String standing, String major) {
		this.id=id;
		this.name=name;
		this.standing=standing;
		this.major=major;
	}
	public String toString() {
    	return id +"  " + name +"  " + standing+"  " +major;
    }
}
