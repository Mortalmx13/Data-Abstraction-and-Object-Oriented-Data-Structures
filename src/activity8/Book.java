package activity8;

//1789
public class Book {

	private String publisher;
	private String title;
	private String isbn;
	private String author;
	private int publisherYear;
	
	public Book(String publisher, String title,String isbn,String author, int publisherYear) {
		this.publisher = publisher;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.publisherYear = publisherYear;
	}
	//gets book publisher
	public String getPublisher() {
		return publisher;
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
	//gets book publisherYear
	public int getPublisherYear() {
		return publisherYear;
	}
	//prints all get statments
	public String toString() {
	    return getIsbn()+ " "+ getTitle()  + " " + getAuthors()+ " "+getPublisher() + "   " +getPublisherYear();
	    }
	
}

