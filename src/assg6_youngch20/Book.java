package assg6_youngch20;


public class Book implements Comparable<Book> {

	private String publisher;
	private String title;
	private String isbn;
	private String author;
	private String publisherYear;
	/**
	 * Constructor for book that takes in 5 variables  
	 * @param publisher
	 * @param title
	 * @param isbn
	 * @param author
	 * @param publisherYear
	 */
	public Book(String publisher, String title,String isbn,String author, String publisherYear) {
		this.publisher = publisher;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.publisherYear = publisherYear;
	}
	/**
	 * gets publisher
	 * @return
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * sets publisher to a val
	 * @param publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher= publisher;
	}
	/**
	 * gets the title
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * gets the isbn
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * sets the isbn
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * gets the author
	 * @return
	 */
	public String getAuthors() {
		return author;
	}
	/**
	 * sets the author
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * gets the publisher year
	 * @return
	 */
	public String getPublisherYear() {
		return publisherYear;
	}
	/**
	 * sets the publisherscyear
	 * @param publisherYear
	 */
	public void setPublisherYear(String publisherYear) {
		this.publisherYear = publisherYear;
	}
	/**
	 * sets up all the gets methods so it prints out clearly to the user
	 */
	public String toString() {
	    return getIsbn()+ "\n"+ getTitle()  + "\n" + getAuthors()+ " \n"+getPublisher() + "  \n " +getPublisherYear();
	    }
	/**
	 * checks if the two titles are equal
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
	          Book val = (Book) obj;
	          return title.equals(val.getTitle());
	      }
	   return false;
	}
	
	@Override
	/**
	 * compares one book to another
	 * @param e
	 * @return
	 */
	 public int compareTo(Book e) {
		   return this.title.compareTo(e.getTitle());
	   }
	
}

