package assg9_youngch20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookManager {
    

    
    public static PhoneBook loadFromFile(String fileName) throws IOException {
       
        BufferedReader reader = null;
        PhoneBook Pb = new PhoneBook();
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            String[] arr;
            while ((line = reader.readLine()) != null) {
               arr = line.split("\t");
               
               Pb.addContact(arr[0], arr[1]);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return Pb;
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
       PhoneBook Pb = loadFromFile("assg9_phoneBook.txt");
      
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add a contact");
            System.out.println("2. Delete a contact");
            System.out.println("3. Search phone number");
            System.out.println("4. Update phone number");
            System.out.println("5. Display the phone book in sorted order");
            System.out.println("6. Save and exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Pb.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    Pb.deleteContact(name);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.println(Pb.searchPhoneNumber(name).getPhoneNumber());
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    phoneNumber = scanner.nextLine();
                    Pb.updatePhoneNumber(name, phoneNumber);
                    break;
                case 5:
                	ArrayList<Person> phoneBookList = Pb.getSortedPhoneBook();
                	
                    for (Person person : phoneBookList) {
                        System.out.println(person.getKey() + "\t" + person.getPhoneNumber());
                    }
                    break;
                case 6:
                Pb.saveToFile("assg9_phoneBook.txt");
                    break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        PhoneBookManager manager = new PhoneBookManager();
        manager.start();
    }
}




