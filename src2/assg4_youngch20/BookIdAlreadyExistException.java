package assg4_youngch20;
//Charles Young YOUNGCH20
public class BookIdAlreadyExistException extends Exception {
//sets up an exception if book already exist
	public BookIdAlreadyExistException () {
		super("Book id already exist");
	}
public BookIdAlreadyExistException (String bookId) {
	super(bookId);
	}

}
