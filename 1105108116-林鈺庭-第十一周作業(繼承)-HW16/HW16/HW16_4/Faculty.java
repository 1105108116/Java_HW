
public class Faculty extends Employee{
	private String position;
	
	void setPosition(String position) {
		this.position = (position == "Professor" || position == "Associate Professor" || position == "Assistant Professor" ? position : "Assistant Professor");
	}
	
	public String getPosition() {
		return position;
	}
	
	Faculty(String name, int age, short pid, String phone, String department, int salary,String position) {
		super(name, age, pid, phone, department, salary);
		this.position = position;
	}
	Faculty(){
		this(null,0,(short)0,"00000","A",30000,"Assistant Professor");
	}
	//不能只初始化自己定義的類別
	/*Faculty(String position){
		this.position = position;
	}*/
	
	
	public void showProfile() {
		super.showProfile();
		System.out.print("\n職級"+position);
	}
	
}
