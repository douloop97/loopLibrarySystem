package librarySystem;

public class PostgreSqlLogger implements LogService{

	@Override
	public void log(String message) {
		System.out.println(message);
		
	}
	
}
