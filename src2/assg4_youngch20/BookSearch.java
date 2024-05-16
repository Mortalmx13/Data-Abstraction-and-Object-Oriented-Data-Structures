package assg4_youngch20;
//Charles Young YOUNGCH20


import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class BookSearch {

	public static void main(String[] args) throws BookNotFoundException {
		//sets fname to the .txt file
		String fname = "assg4_catalog.txt";
		String line;
		int counter =0;
		String stringArr[] = new String[7];
		Book[] booksArr = new Book[7];
		int bookNum;
		
		
		try {
			//grabs the .txt file
		Scanner scan = new Scanner(new FileReader(fname));
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			stringArr = line.split("\t",5);
			//sets up to take booksearch from book.java
			booksArr[counter] = new Book(stringArr[0],stringArr[1],stringArr[2],stringArr[3],stringArr[4].charAt(0));
			counter++;
		}
		
		//sets a catch if there isnt a file
	}catch(FileNotFoundException a) {
		System.out.println("There was an error opening");
		System.exit(1);
	}
		try {
			//searches for the files
			for(int y = 0; y< stringArr.length; y++) {
				if(booksArr[y] != null) {
					if(booksArr[y].getBookId().equals(booksArr[y+1].getBookId())) {
						throw new BookIdAlreadyExistException();
					}
					System.out.println(booksArr[y]);
				}
			}
			//catchs if there is already a file with that id
		}catch(BookIdAlreadyExistException a)
		{
			new BookIdAlreadyExistException();
		}
		System.out.println("Number of books: " +(counter-1));
		while(true) {
			String userInput;
			Scanner objScanner = new Scanner(System.in);
			userInput = objScanner.nextLine();
			//stops if the user inputs STOP
			if(userInput == "STOP") {
				System.out.println("Customer has stopped asking for book");
				System.exit(0);
			}
			else {
				//prompts the user to input alother id
				System.out.println("Enter Book ID: ");
				bookNum = Book.bookSearch(booksArr, (counter-1), userInput);
				
				System.out.println(booksArr[bookNum].toString());
				}
			}
		}
	}

