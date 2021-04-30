package ders02Odev;

public class SubjectManager {

	public void studentInfo(Students student) {
		System.out.println("Hoþ geldin " + student.name + ". " + student.school + " okuluna mý gidiyorsun?");
	}

	public void teacherInfo(Teachers teacher) {
		System.out.println("Merhaba " + teacher.name + " hocam! Ben " + teacher.subject + " seviyorum");
	}
}
