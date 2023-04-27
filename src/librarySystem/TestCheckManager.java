package librarySystem;

public class TestCheckManager implements UserCheckService{

	@Override
	public boolean checkIsRealPerson(User user) {
		System.out.println("TEST: Result -> Fake Person");
		return false; // Test için kullan
	}
	
}
