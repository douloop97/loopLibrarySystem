package librarySystem;

import java.time.LocalDate;

public class BookManager{
	LogService logService;
	
	public BookManager(LogService logService) {
		super();
		this.logService = logService;
	}
	public void add(Book book) {
		logService.log("Book has been added to db " + book.getISBN());
	}
	public void delete(Book book) {
		logService.log("Book has been deleted to db " + book.getISBN());
	}
	public void update(Book book) {
		logService.log("Book has been updated to db " + book.getISBN());
	}
	
	
	public void borrow(Book book, User user) {
		
		System.out.println(user.getFirstName() + " borrowed the " + book.getBookname() + " on " + LocalDate.now()+ "." );
	}
}
