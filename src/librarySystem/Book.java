package librarySystem;

public class Book {
	int ISBN;
	String bookName;
	String writerName;
	String publisher;

public Book(){
	
}

public Book(int iSBN, String bookname, String writerName, String publisher) {
		super();
		ISBN = iSBN;
		this.bookName = bookname;
		this.writerName = writerName;
		this.publisher = publisher;
	}
	
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getBookname() {
		return bookName;
	}
	public void setBookname(String bookname) {
		this.bookName = bookname;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
	
}

