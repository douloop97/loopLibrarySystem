package librarySystem;

public class UserManager{
	private UserCheckService userCheckService;
		
	private LogService logService;

	public UserManager(UserCheckService userCheckService, LogService logService) {
		super();
		this.userCheckService = userCheckService;
		this.logService = logService;
	}
	public UserManager() {
		
	}
	public void add(User user){
		System.out.println("Checking");
		if (!userCheckService.checkIsRealPerson(user)) {
		} 
		else {
			logService.log("User added who has NID: "+ user.getTcNo());
		}
	}
	public void update(User user) {
		logService.log("User updated who has NID: "+ user.getTcNo());

	}
	public void delete(User user) {
		logService.log("User removed who has NID: "+ user.getTcNo());

	}
	
}
