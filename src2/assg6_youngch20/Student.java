package assg6_youngch20;



public class Student implements Comparable<Student> {

	 private String id;
	 private String name;
	 private String standing;
	 private String major;
	    /**
	     * 
	     * @param id
	     * @param name
	     * @param standing
	     * @param major
	     */
	 public Student(String id, String name, String standing, String major){
	        this.id = id;
	        this.name = name;
	        this.standing = standing;
	        this.major = major;
	  }
	    /**
	     * gets id
	     * @return
	     */
	  public String getId(){
	        return id;
	  }
	    /**
	     * gets name
	     * @return
	     */
	   public String getName(){
	        return name;
	   }
	   
	   /**
	    * gets standing 
	    * @return
	    */
	   public String getStanding(){
	        return standing;
	   }
	    /**
	     * gets major
	     * @return
	     */
	   public String getMajor(){
	        return major;
	   }
	   /**
	    * sets the major
	    * @param setMajor
	    */
	   public void setMajor(String setMajor) {
		   major = setMajor;
	   }
	    
	   /**
	    * calls the tostring to print out id,name,standing,major
	    */
	   public String toString(){
	        return id + "," + name + "," + standing + "," + major;
	    }
	   /**
	    * checks to see if two different things are equal to one another
	    */
	   public boolean equals(Object obj) {
		   if (obj instanceof Student) {
		          Student val = (Student) obj;
		          return id.equals(val.getId());
		      }
		   return false;
	   }
	   /**
	    * compares id of students
	    */
	   public int compareTo (Student e) {
		   return this.id.compareTo(e.id);
	   }
	
}
