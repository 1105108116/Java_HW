
public class Faculty extends Employee{
	private String position;
	
	void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}
	
	Faculty(String name, int age, short pid, String phone, String department, int salary,String position) {
		super(name, age, pid, phone, department, salary);
		this.position = position;
	}
	Faculty(){
		this(null,0,(short)0,null,null,0,null);
	}
	//����u��l�Ʀۤv�w�q�����O
	/*Faculty(String position){
		this.position = position;
	}*/
	
	
	public void showProfile() {
		super.showProfile();
		System.out.print("\n¾��"+position);
	}
	
}
