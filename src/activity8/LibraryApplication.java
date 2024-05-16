package activity8;

import java.util.Scanner;

public class LibraryApplication {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String fileName = scan.nextLine();

        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.loadData(fileName);

        System.out.println("All books in the catalog:");
        bookCatalog.displayCatalog();

        
    }
}
