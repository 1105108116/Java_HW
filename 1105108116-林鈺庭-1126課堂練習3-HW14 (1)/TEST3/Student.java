package class_test;

public class Student extends Person{
	private String student_id,student_major;
	
	Student(String name,int age,int height,int weight,String student_id,String student_major) {
		super(name,age,height,weight);
		this.student_id = student_id;
		this.student_major = student_major;
	}
	Student(){
		super();
	}
	public void showProfile() {
		super.showProfile();
		System.out.println("¾Ç¸¹¡G"+student_id+"\n¥D­×¡G"+student_major);
	}

}
