package librarySystem;

public class User {

 String firstName;
 String middName;
 String surname;
 private int id;
 private int tcNo;
 int birthYear;
 
 public User(){
	 
 }
 
public User(String firstName, String middName, String surname, int id, int tcNo, int birthYear) {
		super();
		this.firstName = firstName;
		this.middName = middName;
		this.surname = surname;
		this.id = id;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
	}
	
public User(String firstName, String surname, int id, int tcNo, int birthYear) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.id = id;
		this.tcNo = tcNo;
		this.birthYear = birthYear;
	}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getMiddName() {
	return middName;
}


public void setMiddName(String middName) {
	this.middName = middName;
}


public String getSurname() {
	return surname;
}


public void setSurname(String surname) {
	this.surname = surname;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getTcNo() {
	return tcNo;
}


public void setTcNo(int tcNo) {
	this.tcNo = tcNo;
}


public int getBirthYear() {
	return birthYear;
}


public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}
 
}
