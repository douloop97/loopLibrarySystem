package librarySystem;

public class MernisCheckManager implements UserCheckService{

	@Override
	public boolean checkIsRealPerson(User user) {
		int getNIDFromMernis = 123; //Mernisten gelen Tc No;
		String getFirstNameFromMernis = "Furkan"; //Mernisten gelen isim
		int getBirthYearFromMernis = 2001; // Mernisten gelen doğum tarihi
		if (user.getTcNo() == getNIDFromMernis) {
			if (user.getFirstName() == getFirstNameFromMernis) {
				if (user.getBirthYear() == getBirthYearFromMernis) {
					System.out.println("User checked. Result: Real User");
					return true;
				}
				else {
					System.out.println("Birth year has not matched! " + user.getBirthYear());
					return false;
				}
			} 
			else {
				System.out.println("First name hast not matched! " + user.getFirstName());
				return false;
			}
		}
		else {
			System.out.println("User's TCID has not matched! " + user.getTcNo());
			return false;
		}
	}

}
