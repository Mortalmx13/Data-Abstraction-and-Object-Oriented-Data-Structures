package activity6;

public class UGStudent extends Student{
private String major;
/**
 * Default constructor
 */
public UGStudent() {
super();  // call the default constructor of Student class
major = "undeclared";
}
/**
 * Constructor with a given Id, name, and major
 * @param initId The given id
 * @param initName The given name
 * @param initMajor The given major
 */
public UGStudent(int initId, String initName, String initMajor) {
super(initId, initName);  // call the 2-parameter constructor of 

major = initMajor;
}
/**
 * Retrieve the major
 * @return The major
 */
public String getMajor() {
return major;
}
/**
 * Modify the major
 * @param newMajor The new major
 */
public void setMajor(String newMajor) {
major = newMajor;
}
/**
 * Return a string with information of id, name, and major
 * @return The string with id, name, and major
 */
@Override
public String toString() {
return "ID: " + getId() + "\n" + "Name: " + getName() + "\n" + "Major: " + major;
}
/**
 * Display the information of id, name, and major
 */
@Override
public void displayInfo() {
super.displayInfo(); // call the displayInfo method in the Student 
System.out.println("Major: " + major +"\n");
}
}
