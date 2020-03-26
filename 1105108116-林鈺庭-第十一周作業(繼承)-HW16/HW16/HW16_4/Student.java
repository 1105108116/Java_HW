
public class Student extends Person{
	String sid,major;
	int credit;
	void setSid(String sid) {
		this.sid = (sid.equals("0") ? null : sid);
	}
	void setMajor(String major) {
		this.major = (major.equals(null) ? null : major);
	}
	void setCredit(int credit) {
		this.credit = (credit<0 ? 0 : credit);
	}
	public String getSid() {
		return sid;
	}
	public String getMajor() {
		return major;
	}
	public int getCredit() {
		return credit;
	}
	
	Student(String name,int age,int height,int weight,String sid,String major,int credit){
		super(name,age,height,weight);
		setSid(sid);
		setMajor(major);
		setCredit(credit);
	}
	Student(String name,int age,int height,int weight,String sid,String major){
		super(name,age,height,weight);
		setSid(sid);
		setMajor(major);
	}
	Student(String name,int age,int height,int weight,String sid){
		super(name,age,height,weight);
		setSid(sid);
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
