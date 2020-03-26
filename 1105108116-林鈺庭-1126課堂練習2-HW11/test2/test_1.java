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
		System.out.println("姓名："+name+"\n年齡："+age+"\n身高："+height+"\n體重："+weight);
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
		System.out.println("學號："+student_id+"\n主修："+student_major);
	}
	
}
