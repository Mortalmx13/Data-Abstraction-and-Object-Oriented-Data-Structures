package assg6_youngch20;

import java.util.Scanner;

public class LibraryApplication {

	public static void main(String[] args) {

        int option =0;
        String fileName = "assg6_catalog.txt";
        Scanner key = new Scanner(System.in);
        String input, publisher = null, title, isbn = null, author = null, publisherYear = null;
        BookCatalog z1 = new BookCatalog();
        z1.loadData(fileName);

       
        
        Scanner enter = new Scanner(System.in);
		while(option!=9) {
		menu();
		option = enter.nextInt();
		switch(option) {
		case 1:
			z1.displayCatalog();;
			System.out.println("Press enter to continue");
			input = enter.nextLine();
			if(input =="") {
				break;
			}
		case 2:
			System.out.println("Enter a title: \n");
			title = key.next();
			if(z1.searchForBook(title) != null) {
				System.out.println(z1.searchForBook(title));
			}
			else {
				System.out.println("\nNo title with that name");
			}
				System.out.println("\nPress enter to continue");
				input = enter.nextLine();
				if(input =="") {
					break;
				}
				
			
		case 3:
			System.out.println("\nEnter a title: ");
			title = key.next();
			if(z1.searchForBook(title) == null) {
				System.out.println("\nEnter Name for author: ");
				author = key.next();
				System.out.println("\nEnter ISBN: ");
				isbn = key.next();
				System.out.println("\nEnter publisher: ");
				publisher = key.next();
				System.out.println("\nEnter publisherYear: ");
				publisherYear = key.next();
				z1.addBook(title, author, isbn, publisher,publisherYear);
				z1.save();
			}
				System.out.println("\nPress enter to continue");
				input = enter.nextLine();
				if(input =="") {
					break;
				}
		case 4:
			System.out.println("\nEnter a title: ");
			title = key.next();
			if(z1.searchForBook(title) != null) {
			z1.updateBook(isbn, title, author, publisher, publisherYear);
				z1.save();
			}
			System.out.println("\nPress enter to continue");
			input = enter.nextLine();
			if(input =="") {
				break;
			}
			
		case 5:
			System.out.println("\nEnter an ID: ");
			title = key.next();
			if(z1.removeBook(title) == false) {
				
				System.out.println("\nNo student with that ID");
			}else {
				z1.removeBook(title);;
				z1.save();
				
			}
				System.out.println("\nPress enter to continue");
				input = enter.nextLine();
				if(input =="") {
					break;
				}
		case 6:
			System.out.println("\nEnter a publisher");
			publisher = key.next();
			if(z1.getBooksByPublisher(publisherYear) != null) {
				z1.getBooksByPublisher(publisherYear);
			}else {
				System.out.println("\nNo publisher by that name");
			}
			System.out.println("\nPress enter to continue");
			input = enter.nextLine();
			if(input =="") {
				break;
			}
			
		case 7:
			z1.sortByTitle();
			z1.save();
			System.out.println("\nPress enter to continue");
			input = enter.nextLine();
			if(input =="") {
				break;
			}
		case 8:
			z1.save();
			System.out.println("\nPress enter to continue");
			input = enter.nextLine();
			if(input =="") {
				break;
			}
		}
		}
	}

    
	
	
	
	
	static void menu(){
		System.out.println("1. Display all the books in the catalog");
		System.out.println("2. Search for a book");
		System.out.println("3. Add a new book");
		System.out.println("4. Update an existing book");
		System.out.println("5. Remove a book");
		System.out.println("6. Display books by a publisher");
		System.out.println("7. Sort all the books based on title");
		System.out.println("8. Save Data");
		System.out.println("9. Exit");
	}
}
