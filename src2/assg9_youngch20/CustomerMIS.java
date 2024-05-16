/**
 * Charles Young
 */
package assg9_youngch20;

import java.util.Scanner;

import activity12.BinarySearchTree;

public class CustomerMIS {

	public static void main(String[] args) {
		
		String fname = "assg9_CustomerRoster.txt";
		
		BinarySearchTree<Customer, String>roster;
		CustomerRoster c1 = new CustomerRoster();
		c1.load(fname);
		
		int option = 0;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String input, id, name, phoneNumber;
		
		while(option != 7){
			menu();
			option = scan.nextInt();
			scan.nextLine();
			switch(option){
			case 1:
				c1.displayRoster();
				System.out.println("\nPress enter to continue");
				input = scan2.nextLine();
				if (input == "")
					break;
			case 2:
				System.out.println("Enter an id: ");
				id = scan.nextLine();
				if(c1.searchCustomer(id) == null){
					
					System.out.println("Enter name: \n");
					name = scan.nextLine();
					
					System.out.println("Enter phone number: \n");
					phoneNumber = scan.nextLine();
					
					Customer c = new Customer(id, name, phoneNumber);
					c1.addCustomer(c);
					System.out.println("\nCustomer added.");
				}
				else{
					System.out.println("\nCustomer already exists");
				}
				System.out.println("\nPress enter to continue");
				input = scan2.nextLine();
				if (input == "")
					break;
			case 3:
				System.out.println("\nEnter an id: ");
				id = scan.next();
				if(c1.searchCustomer(id) != null){
					
					c1.deleteCustomer(id);
					System.out.println("\nCustomer removed");
				}
				else{
					System.out.println("Customer not found");
				}
				System.out.println("\nPress enter to continue");
				input = scan2.nextLine();
				if (input == "")
					break;
			case 4:
				System.out.println("\nEnter an id: ");
				id = scan.nextLine();
				if(c1.searchCustomer(id) == null){
					System.out.println("Customer does not exist.");
				}
				else{
					Customer c = c1.searchCustomer(id);
					System.out.println(c.getName() + "\t" + c.getPhone() + "\n");
				}
				
				System.out.println("\nPress enter to continue");
				input = scan2.nextLine();
				if (input == "")
					break;
			case 5:
				System.out.println("Enter an id: ");
				id = scan.nextLine();
				if(c1.searchCustomer(id) == null){
					System.out.println("Customer does not exist.");
				}
				else{
					Customer c = c1.searchCustomer(id);
					System.out.println("Enter a name: ");
					name = scan.nextLine();
					
					c.setName(name);
					System.out.println("Enter a phone number: ");
					
					phoneNumber = scan.nextLine();
					
					c.setPhone(phoneNumber);
					System.out.println("\nInfo updated.\n");
				}
				System.out.println("\nPress enter to continue");
				input = scan2.nextLine();
				if (input == "")
					break;
			case 6:
				c1.save();
				System.out.println("\nFile saved and System exited");
				System.exit(1);
				break;
			}
		}

	}
	
	/**
	 * This allows implements the menu and shows the user their options
	 */
	private static void menu()
	{
		System.out.println("1. Display the roster \n2. Add a customer"+ "\n3. Delete a customer \n4. Search for a customer \n5. Update customer info"+ "\n6. Save to file and Exit");
	}

}
