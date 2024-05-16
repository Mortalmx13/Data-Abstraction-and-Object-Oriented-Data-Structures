package assg6_youngch20;

import java.util.ArrayList;
/**
 * sets up classes with the methods
 * @author owner
 *
 */
public interface StudentListInterface {

	public void loadData(String fileN);
	public void displayRoster();
	public Student searchForStudent(String searchID);
	public boolean addStudent(String id, String name, String standing, String major);
	public boolean removeStudent(String id);
	public ArrayList<Student>getStudentByMajor(String major);
	public void sort();
	public void save();
	
}
