package ders2Odev;

public class Teachers {

	public Teachers() {
		System.out.println("I am a Teacher");
	}
	
	public Teachers (	String name,int age,String school,String subject){
		this();
		this.name=name;
		this.age=age;
		this.school=school;
		this.subject=subject;
	}
	String name;
	int age;
	String school;
	String subject;
	
}
