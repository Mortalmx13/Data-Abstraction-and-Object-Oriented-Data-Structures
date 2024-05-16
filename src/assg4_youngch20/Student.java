package assg4_youngch20;
//Charles Young

public class Student  {

	private String id;
	private String name;
	private char gender;
	private String bDate;
	private String major;
	/**
	 * constructor with major
	 * @param id
	 * @param name
	 * @param gender
	 * @param bDate
	 * @param major
	 */
	public Student(String id, String name, char gender,String bDate, String major) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.bDate = bDate;
		this.major = major;
	}
	/**
	 * constructor that doesn't have major
	 */
	public Student(String id, String name, char gender,String bDate) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.bDate = bDate;
		major = "undeclared";
	}
	/**
	 * gets id
	 * @return
	 */
	public String getId() {
		return id;
	}
	/**
	 * gets name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * gets gender
	 * @return
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * gets birthday
	 * @return
	 */
	public String getBdate() {
		return bDate;
	}
	/**
	 * gets major
	 * @return
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * sets major
	 * @param major
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * writes all the different variables
	 */
	public String toString() {
	    return getId() + "   "+ getName()+ " "+ getGender() + " " + getBdate()+ " "+ getMajor();
	    }
	/**
	 * searches the student by their name in the list
	 * @param roster
	 * @param numOfStud
	 * @param name
	 * @return
	 * @throws StudentNotFoundException
	 */
	public static int StudentSearchByName(Student[] roster, int numOfStud, String name) throws StudentNotFoundException {
		 
		 for(int i=0;i<numOfStud;i++) {
			 if(roster[i].getName().equals(name)) {
				 return i;
			 }
			 }
		 throw new StudentNotFoundException("Student with name " + name + " not found.");
		 
	
	}
	/**
	 * searches the student by their id in the list
	 * @param roster
	 * @param numOfStud
	 * @param id
	 * @return
	 * @throws StudentNotFoundException
	 */
	public static int StudentSearchById(Student[] roster, int numOfStud, String id) throws StudentNotFoundException {
		 
		 for(int i=0;i<numOfStud;i++) {
			 if(roster[i].getId().equals(id)) {
				 return i;
			 }
			 }
		 throw new StudentNotFoundException("Student with id " + id + " not found.");
		 
	
	}
}
