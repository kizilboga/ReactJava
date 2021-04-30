package ders03Odev;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.name="idris";
		instructor.subject="Math";
		
		Student student=new Student();
		student.name="Beyza";
		student.className="3A";
		
		//Kullan�c�ya g�re okula gitme durumu
		UserManager[] userManagers=new UserManager[] {new InstructorManager(),new StudentManager()};
		
		for (UserManager userManager : userManagers) {
			userManager.goToSchool();
		}
		
		//Parametreli metod
		UserManager userManager=new UserManager();
		userManager.goToSchool(student);
		
	}

}
