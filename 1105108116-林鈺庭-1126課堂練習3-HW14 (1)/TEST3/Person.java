package class_test;
public class Person {
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
