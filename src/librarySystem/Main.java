package librarySystem;

public class Main {

	public static void main(String[] args) {
		User user1= new User("Furkan", "Ceren", "Yavuz", 1, 1213, 2001);
		Book classic1= new Book(12345, "Anne Karenina", "Tolstoy", "Is Bankasi");
		
		UserManager userManager = new UserManager(new MernisCheckManager(),new PostgreSqlLogger());
		BookManager bookManager = new BookManager(new PostgreSqlLogger());
		
		
		userManager.add(user1);
		bookManager.add(classic1);
		bookManager.borrow(classic1, user1);
	}
}
