package test;
public class test_1 {
	public static void main (String[] args) {
		Student s = new Student("1105108116","CSIE");
		s.showProfile();
		
	}
}
class Person {
	private String name;
	private int age,height,weight;
	Person(String name,int age,int height,int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	Person(){
		this("Null",0,0,0);
	}
	public void showProfile() {
		System.out.println("�m�W�G"+name+"\n�~�֡G"+age+"\n�����G"+height+"\n�魫�G"+weight);
	}
}
class Student extends Person{
	private String student_id,student_major;
	//super(String name,int age,int height,int weight);
	Student(String student_id,String student_major) {
		this.student_id = student_id;
		this.student_major = student_major;
	}
	Student(){
		this("Null","Null");
	}
	public void showProfile() {
		super.showProfile();
		System.out.println("�Ǹ��G"+student_id+"\n�D�סG"+student_major);
	}
	
}
