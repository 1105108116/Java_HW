
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
		System.out.print("�Ǹ�"+sid+"\n�D�׬��"+major+"\n�֭p�ײ߾Ǥ���"+credit);
	}
}
