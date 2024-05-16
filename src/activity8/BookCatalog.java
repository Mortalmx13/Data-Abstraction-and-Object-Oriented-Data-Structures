package activity8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;





public class BookCatalog implements BookCatalogInterface{
	private ArrayList<Book>List	;
	public BookCatalog() {
		List = new ArrayList();
	}

	@Override
	public void loadData(String fileName) {
		Scanner input = null;
		String line;
		String[] arrStr;
		try {
			input = new Scanner(new File(fileName));
			}
			catch(FileNotFoundException e) {
			System.out.println("Cannot find input file");
			System.exit(1);
			}
			while (input.hasNextLine()) {
			line = input.nextLine();
			arrStr = line.split(",");   
			 String isbn = arrStr[0];
             String title = arrStr[1];
             String author = arrStr[2];
             String publisher = arrStr[3];
             int publisherYear = Integer.parseInt(arrStr[4]);
			List.add(new Book(isbn,title, author,publisher,publisherYear)); 
			
			}
		
	}

	@Override
	public void displayCatalog() {
		for(Book book : List) {
			System.out.println(book.toString());
		}
		
	}
	
}
