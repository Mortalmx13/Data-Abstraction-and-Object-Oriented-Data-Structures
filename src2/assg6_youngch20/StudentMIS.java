package assg6_youngch20;

import java.util.Scanner;

public class StudentMIS {

	public static void main(String[] args) {
		String fileN =  "assg6_Data.txt";
		
		StudentList z1 = new StudentList();
		z1.loadData(fileN);
		
		
		

		int option = 0;
		Scanner key = new Scanner(System.in);
		Scanner enter = new Scanner(System.in);
		String input, id, name, standing, major;
		while(option != 8) {
			menu();
			option = key.nextInt();		
			switch(option) {
			case 1:
				z1.displayRoster();
				System.out.println("Press enter to continue");
				input = enter.nextLine();
				if(input =="") {
					break;
				}
			case 2:
				System.out.println("Enter an ID: \n");
				id = key.next();
				if(z1.searchForStudent(id) != null) {
					System.out.println(z1.searchForStudent(id));
				}
				else {
					System.out.println("\nNo sudent with that ID");
				}
					System.out.println("\nPress enter to continue");
					input = enter.nextLine();
					if(input =="") {
						break;
					}
					
				
			case 3:
				System.out.println("\nEnter an ID: ");
				id = key.next();
				if(z1.searchForStudent(id) == null) {
					System.out.println("\nEnter Name: ");
					name = key.next();
					System.out.println("\nEnter Standing: ");
					standing = key.next();
					System.out.println("\nEnter Major: ");
					major = key.next();
					z1.addStudent(id, name, standing, major);
					z1.save();
				}
					System.out.println("\nPress enter to continue");
					input = enter.nextLine();
					if(input =="") {
						break;
					}
			case 4:
				System.out.println("\nEnter an ID: ");
				id = key.next();
				if(z1.removeStudent(id) == false) {
					
					System.out.println("\nNo student with that ID");
				}else {
					z1.removeStudent(id);
					z1.save();
					
				}
					System.out.println("\nPress enter to continue");
					input = enter.nextLine();
					if(input =="") {
						break;
					}
			case 5:
				System.out.println("\nEnter a major");
				major = key.next();
				if(z1.getStudentByMajor(major).size()>0) {
					for(int i = 0; i< z1.getStudentByMajor(major).size();i++) {
						System.out.println(z1.getStudentByMajor(major).get(i));
					}
				}else {
					System.out.println("\nNo student has that major");
				}
				System.out.println("\nPress enter to continue");
				input = enter.nextLine();
				if(input =="") {
					break;
				}
				
			case 6:
				z1.sort();
				z1.save();
				System.out.println("\nPress enter to continue");
				input = enter.nextLine();
				if(input =="") {
					break;
				}
			case 7:
				z1.save();
				System.out.println("\nPress enter to continue");
				input = enter.nextLine();
				if(input =="") {
					break;
				}
				
			}
		}
	}

	private static void menu() {
		System.out.println("1. Display the roster");
		System.out.println("2. Search for a student by id ");
		System.out.println("3. Add a new student");
		System.out.println("4. Remove a student ");
		System.out.println("5. Search for students by major");
		System.out.println("6. Sort and save to file ");
		System.out.println("7. Save to file ");
		System.out.println("8. Exit ");
		
	}
	
}
