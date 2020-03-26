
public class Student extends Person{
	String sid,major,credit;
	Student(String name,int age,int height,int weight,String sid,String major,String credit){
		super(name,age,height,weight);
		this.sid = sid;
		this.major = major;
		this.credit = credit;
	}
	public void showProfile() {
		super.showProfile();
		System.out.print("學號"+sid+"\n主修科目"+major+"\n累計修習學分數"+credit);
	}
}
