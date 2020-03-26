
public class Student extends Person{
	String sid,major,credit;
	Student(String name,int age,int height,int weight,String sid,String major,String credit){
		super(name,age,height,weight);
		this.sid = sid;
		this.major = major;
		this.credit = credit;
	}
	Student(String name,int age,int height,int weight,String sid,String major){
		this(name,age,height,weight,sid,major,null);
	}
	Student(String name,int age,int height,int weight,String sid){
		this(name,age,height,weight,sid,null,null);
	}
	Student(String name,int age,int height,int weight){
		super(name,age,height,weight);
	}
	Student(String name,int age){
		super.setName(name);
		super.setAge(age);
	}
	Student(String name){
		super.setName(name);
	}
	Student(){
		this(null,0,0,0,null,null,null);
	}
	public float calBMI(int h,int w) {
		float BMI = (float)w/(float)(h*h/10000.0);
		return BMI;
	}
	public void showProfile() {
		super.showProfile();
		System.out.print("BMI："+calBMI(super.getHeight(),super.getWeight())+"\n學號"+sid+"\n主修科目"+major+"\n累計修習學分數"+credit);
	}
}
