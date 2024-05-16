package assg6_youngch20;

import java.io.*;
import java.util.*;





public class BookCatalog implements BookCatalogInterface {
	 ArrayList<Book> list;
	 
	public BookCatalog() {
		list = new ArrayList<Book>();
	}

/**
 * loads the document into program
 */
	public void loadData(String fileName) {
	    Scanner scanner = null;
	    fileName = "assg6_catalog.txt";
	    try {
	        scanner = new Scanner(new File(fileName));
	        while (scanner.hasNextLine()) {
	            String isbn = scanner.nextLine();
	            String title = scanner.nextLine();
	            String author = scanner.nextLine();
	            String publisher = scanner.nextLine();
	            String year = scanner.nextLine();
            
	            Book book = new Book(isbn, title, author, publisher, year);
	            
	   
	            String temp = scanner.nextLine();
	           
	            list.add(book);
	        }
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found");
	    } catch (NumberFormatException e) {
	        System.out.println("Invalid year");
	    } finally {
	        if (scanner != null) {
	            scanner.close();
	        }
	    }
	}


	@Override
	/**
	 * displays the catalog
	 */
	public void displayCatalog() {
		for(Book book : list) {
			System.out.println(book.toString());
		}
		
	}
	/**
	 * lets the user look up a book by title
	 */
	public Book searchForBook(String title){
		 for (Book book : list) {
	            if (book.getTitle().equals(title)) {
	                System.out.println(book.toString());
	                return book;
	            }
	        }
	        System.out.println("Book not found.");
	        return null;
	}
	/**
	 * lets the user add a new book
	 */
	public boolean addBook(String isbn, String title, String author, String publisher, String year) {
	    for (Book book : list) {
	        if (book.getTitle().equals(title)) {
	            System.out.println("Book already exists in catalog.");
	            return false;
	        }
	    }
	    list.add(new Book(isbn, title, author, publisher, year));
	    System.out.println("Book added successfully.");
	    return true;
	}
	/**
	 * lets the user update and change a books details
	 */
	public boolean updateBook(String isbn, String title, String author, String publisher, String year) {
	    for (Book book : list) {
	        if (book.getTitle().equals(title)) {
	            book.setIsbn(isbn);
	            book.setAuthor(author);
	            book.setPublisher(publisher);
	            book.setPublisherYear(year);
	            return true;
	        }
	    }
	    System.out.println("Book with ISBN " + isbn + " does not exist in the catalog.");
	    return false;
	}
	/**
	 * removes a book from the list
	 */
	public boolean removeBook(String title)
	{
		  for (Book book : list) {
	            if (book.getTitle().equals(title)) {
	                list.remove(book);
	                System.out.println("Book removed from catalog.");
	                return true;
	            }else {
	            	return false;
	            }
	        }
	        System.out.println("Book not found.");
			return false;
	    }
	public ArrayList<Book> getBooksByPublisher(String publisher) {
	    ArrayList<Book> booksByPublisher = new ArrayList<>();

	    for (Book book : list) {
	        if (book.getPublisher().equals(publisher)) {
	            booksByPublisher.add(book);
	        }
	    }

	    return booksByPublisher;
	}


	/**
	 * sorts the list of books by title
	 */
	public void sortByTitle() {
        Collections.sort(list); 
            //@Override
            //public int compare(Book book1, Book book2) {
              //  return book1.getTitle().compareTo(book2.getTitle());
               
            
        }
    
	/**
	 * saves the catalog
	 */
	public void save() {
       PrintWriter output = null;
       String fname = "assg6_catalog.txt";
       try {
    	   output = new PrintWriter(fname);
    	   for(Book list2 : list) {
    		   output.println(list2.getIsbn() + "\n"+list2.getTitle()+  "\n"+list2.getAuthors()+ "\n"+list2.getPublisher()+"\n"+list2.getPublisherYear());
    	   }
       }
       catch(FileNotFoundException e) {
    	   System.out.println(e.getMessage());
       }
       output.close();
	}
		
}
