package assg4_youngch20;
//Charles Young YOUNGCH20
public class BookNotFoundException extends Exception {
//sets up if there is a book called and it is not in the list
		public BookNotFoundException () {
			super("Book not found!");
		}
	public BookNotFoundException (String bookId) {
		super(bookId);
		}

}
