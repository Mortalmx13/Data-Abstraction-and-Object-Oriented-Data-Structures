package activity4;



public class Course {

	
      private String courseNo;
      private String title;
      private  int credit;
        
    public Course(String courseNo, String getTitle){
    	this.courseNo = courseNo;
    	this.title = getTitle;
    	credit = 3;
    }
    public Course(String courseNo, String getTitle,int getCredit){
    	this.courseNo = courseNo;
    	this.title = getTitle;
    	this.credit = getCredit;
    }
    public String getcourse() {
    	return courseNo;
    }
    public String getTitle(){
    	return title;
    }
    public int getCredit(){
    	return credit;
    }
    public void setTitle(String newTitle){
   	 this.title = newTitle;
   }
    public void setCredit(int newCredit){
    	 this.credit = newCredit;
    	 
    }
    

    public String toString() {
    	return courseNo +" - " + title + credit;
    }

    public void printinfo() {
    	System.out.println(courseNo +" - " + title);
    }
}
