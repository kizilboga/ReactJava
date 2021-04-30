package ders02Odev;

public class Students {
	
	public Students () {
		System.out.println("I am a student");
	}
	
	public Students (String name,int age,String school) {
		this.name=name;
		this.age=age;
		this.school=school;
	}
	String name;
	int age;
	String school;
}
