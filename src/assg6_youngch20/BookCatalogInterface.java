package assg6_youngch20;

import java.util.ArrayList;
import java.util.List;

public interface BookCatalogInterface {
public void loadData(String fileName);
public void displayCatalog();
public Book searchForBook(String title);
public boolean addBook(String ISBN, String title, String author, String pubYear, String publisher );
public boolean updateBook(String isbn, String title, String author, String publisher, String year );
public boolean removeBook(String title);
public ArrayList<Book> getBooksByPublisher(String publisher);
public void sortByTitle();
public void save();
}
