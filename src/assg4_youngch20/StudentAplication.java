/**
 * 
 */
package assg4_youngch20;
//Charles Young
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 * extends students to get the id, name, gender,birth day
 * @author owner
 *
 */
public class StudentAplication extends Student{
	public StudentAplication(String id, String name, char gender, String bDate) {
		super(id, name, gender, bDate);
		// TODO Auto-generated constructor stub
	}

	public static int readFile(Student[] students) {
		int count = 0;
		
		
        try {
            File fileN = new File("assg4_input.txt");
            Scanner scan = new Scanner(fileN);
            
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] params = data.split(",");
                
                String id = params[0];
                String name = params[1];
                char gender = params[2].charAt(0);
                String dateOfBirth = params[3];
                
                if (params.length > 4) {
                    students[count] = new Student(id, name, gender, dateOfBirth, params[4]);
                }
                else {
                	students[count] = new Student(id, name, gender, dateOfBirth);
                }
                 
                count++;
            }
            scan.close();
        } catch (FileNotFoundException e) {
        	System.out.println("There was an error opening");
    		System.exit(1);
        }
        
        return count;
	}
	
	public static void printStudents(Student[] students, int count) {
		for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
	}
	
	public static void Menu() {
		
		System.out.println("1. Search student by id");
		System.out.println("2. Search student by name");
		System.out.println("3. Change student major");
		System.out.println("4. Exit");
		
	}
	
	
    public static void main(String[] args) {
        Student[] students = new Student[100];
        Scanner scan = new Scanner(System.in);
        int choice = 0, count;
        String id;
        
        
        count = readFile(students);
        
       
        printStudents(students, count);
        System.out.println();
        

        
        
        while (choice != 4) {
        	Menu();
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter student id: ");
                    id = scan.nextLine();
                    
					try {
						int index = StudentSearchById(students, count, id);
						System.out.println(students[index]);
					} catch (StudentNotFoundException e) {
						System.out.println(e.getMessage());
					}
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String name = scan.nextLine();
                    try {
						int index = StudentSearchByName(students, count, name);
						System.out.println(students[index]);
					} catch (StudentNotFoundException e) {
						System.out.println(e.getMessage());
					}
                    break;
                case 3:
                    System.out.print("Enter student id: ");
                    id = scan.nextLine();
                    
                    System.out.print("Enter new major: ");
                    String newMajor = scan.nextLine();
                    
                    try {
						int index = StudentSearchById(students, count, id);
						students[index].setMajor(newMajor);
                        System.out.println("Major for student " + students[index].getName() + " New major is: " + newMajor );
					} catch (StudentNotFoundException e) {
						System.out.println(e.getMessage());
					}
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                
        }
        
        
    }
}
}
