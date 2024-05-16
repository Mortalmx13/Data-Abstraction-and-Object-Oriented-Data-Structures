package assg6_youngch20;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * sends the different methods t the interface
 * @author owner
 *
 */
public class StudentList implements StudentListInterface{
	Scanner input = null;
	 private ArrayList<Student> studList = new ArrayList<Student>();
	
	 public StudentList(){
		 ArrayList<Student> studList = new ArrayList<Student>();
	    }
	    
	   /** 
	    * this is what loads the .txt file
	    */
	    public void loadData(String fileN){
	    	fileN = "assg6_Data.txt";
	    	Scanner input = null;
	    	String line = " ";
	    	String[] params;
	        try{
	             input = new Scanner(new File(fileN));
	            while(input.hasNextLine()){
	               line = input.nextLine();
	               params = line.split(",");
	               studList.add(new Student(params[0],params[1],params[2],params[3]));
	            }
	            input.close();
	        }
	        catch(FileNotFoundException a){
	            System.out.println("Error loading data.");
	            System.exit(0);
	        }
	    }
	    
	   /**
	    * searches for a specific student by the id
	    */
	    @Override
	        public Student searchForStudent(String searchID) {
	        	for (Student student : studList) {
	        		if(searchID.equals(student.getId())) {
	        			return student;
	        		}
	        	}
	        	return null;
	        }
	    /**
	     * adds a new student to the list
	     */
	        @Override
	        public boolean addStudent(String id, String name,String standing, String major) {
	        	for(Student student : studList) {
	        		if(id.equals(student.getId())) {
	        			System.out.println("");
	        			return false;
	        		}
	        		
	        	}
	        	studList.add(new Student(id, name, standing, major ));
	        	return true;
	        }
	        /**
	         * removes a student from the list by the id
	         */
	        @Override
	        public boolean removeStudent(String id) {
	        	for(Student student : studList) {
	        		
	        		if(id.equals(student.getId())) {
	        			
	        			studList.remove(student);
	        			return true;
	        			
	        		}
	        		
	        	}
	        	
	        	return false;
	        }
	       /**
	        * sorts the list of students
	        */
	        @Override
	        public void sort() {
	        	Collections.sort(studList);
	        }
	        /**
	         * saves the list of students
	         */
	        @Override
	        public void save() {
	        	PrintWriter printout = null;
	        	File fileN = new File("assg6_Data.txt");
	        	try {
	        		printout = new PrintWriter(fileN);
	        		for(int i = 0; i < studList.size(); i++) {
	        			printout.println(studList.get(i).toString());
	        		}
	        	}
	        	catch(FileNotFoundException a) {
	        		System.out.println(a.getMessage());
	        	}
	        	printout.close();
	        }

/**
 * displays the list of different students
 */
			@Override
			public void displayRoster() {
				for(Student student: studList){
		            System.out.println(student);
		        }
			}

/**
 * gets the students by their majors
 */
			@Override
			public ArrayList<Student> getStudentByMajor(String major) {
				ArrayList<Student> studMajor = new ArrayList<Student>();
	        	for(Student student: studList) {
	        		if(major.equals(student.getMajor())) {
	        			studMajor.add(student);
	        		}
	        	}
	        	return studMajor;
			}
	    }


