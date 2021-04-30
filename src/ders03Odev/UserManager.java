package ders03Odev;

public class UserManager {
	public void goToSchool() {
		System.out.println("Yes i am in school" );
	}
	
	public void goToSchool(User user) {
		System.out.println("Yes i am in school "+user.name );
	}
}
