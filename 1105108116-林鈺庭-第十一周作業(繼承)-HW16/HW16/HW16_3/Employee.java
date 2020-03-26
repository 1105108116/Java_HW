
public class Employee extends Person {
	private String phone,department;
	private short pid;
	private int salary;
	
	void setPid(short pid) {
		this.pid = pid;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	void setDepartment(String department) {
		this.department = department;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	public short getPid() {
		return pid;
	}
	public String getPhone() {
		return phone;
	}
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	Employee(String name,int age,int height,int weight,short pid,String phone,String department,int salary){
		super(name,age,height,weight);
		this.pid = pid;
		this.phone = phone;
		this.department = department;
		this.salary = salary;
	}
	Employee(String name,int age,short pid,String phone,String department,int salary){
		super.setName(name);
		super.setAge(age);
		this.pid = pid;
		this.phone = phone;
		this.department = department;
		this.salary = salary;
	}
	
	public void showProfile() {
		super.showProfile();
		System.out.print("人事編號"+pid+"\n分機號碼："+phone+"\n部門"+department+"\n薪資"+salary);
	}

}
