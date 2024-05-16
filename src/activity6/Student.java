package activity6;

public class Student {
private int id;
private String name;
/**
 * default constructor
 */
public Student() {
id = 0;
name = "unknown";
}
/**
 * Constructor with a given Id and a given name
 * @param givenId The given id
 * @param givenName The given name
 */
public Student(int givenId, String givenName) {
id = givenId;
name = givenName;
}
/**
 * Retrieve the id 
 * @return The id
 */
public int getId() {
return id;
}
/**
 * Retrieve the name
 * @return The name
 */
public String getName() {
return name;
}
/**
 * Modify the id
 * @param newId The new value for the id
 */
public void setId(int newId) {
id = newId;
}
/**
 * Modify the name
 * @param newName The new value for the name
 */
public void setName(String newName) {
name = newName;
}
/**
 * Return a string with information of id and name
 * @return The string with id and name
 */
public String toString() {
return "ID: " + id + "\n" + "Name: " + name;
}
/**
 * Display the information of id and name
 */
public void displayInfo() {
System.out.println("ID: " + id);
System.out.println("Name: " + name);
}
}
