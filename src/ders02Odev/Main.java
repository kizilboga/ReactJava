package ders02Odev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students student1 = new Students("Ahmet", 6, "Mimar Sinan");
		Students student2 = new Students("Mehmet", 9, "Uydukent");
		Students student3 = new Students();

		Students[] student = { student1, student2, student3 };

		for (Students students : student) {
			System.out.println(students.name);
		}

		System.out.println("-------------------");

		Teachers teacher1 = new Teachers();
		Teachers teacher2 = new Teachers("Idris", 33, "Mimar Siana", "Math");
		Teachers teacher3 = new Teachers("Jacob", 31, "Gülüştür", "Computer");
		Teachers[] teachers = { teacher1, teacher2, teacher3 };

		for (Teachers teacher : teachers) {
			System.out.println(teacher.subject);
		}
		
		System.out.println("-----------------");
		
		SubjectManager subjectManager= new SubjectManager();
		subjectManager.studentInfo(student1);
		subjectManager.teacherInfo(teacher2);

	}

}
