package test;

public class test_1 {
	public static void main (String[] args) 
	{
		Person one = new Person("Jack", 20, 175, 65);
		one.showProfile();
	}
	
	
	
}
class Person {
	private String name;
	private int age;
	private int height; //����
	private int weight; 
	
	Person(String name,int age,int height,int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void showProfile() {
		System.out.println("�m�W�G"+name+"\n�~�֡G"+age+"\n�����G"+height+"\n�魫�G"+weight);
	}
}
