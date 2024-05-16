package assg4_youngch20;
//Charles Young YOUNGCH20
public class Book {

	private String bookId;
	private String title;
	private String isbn;
	private String author;
	private char category;
	
	public Book(String bookId, String title,String isbn,String author, char category) {
		this.bookId = bookId;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.category = category;
	}
	//gets book id
	public String getBookId() {
		return bookId;
	}
	//gets book title
	public String getTitle() {
		return title;
	}
	//gets book isbn
	public String getIsbn() {
		return isbn;
	}
	//gets book author
	public String getAuthors() {
		return author;
	}
	//gets book category
	public char getCategory() {
		return category;
	}
	//prints all get statments
	public String toString() {
	    return getBookId() + "   "+ getTitle()+ " "+ getIsbn() + " " + getAuthors()+ " "+ getCategory();
	    }
	//grabs all books
	 public static int bookSearch(Book[] books, int size, String bookid) {
		 int i;
		 for(i=0;i<size;i++) {
			 if(books[i].getBookId().equals(books)) {
				 return i;
			 }
		 }
		return i;
			 
	 }
}

