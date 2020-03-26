
public class Employee extends Person {
	private String phone,department;
	private short pid;
	private int salary;
	
	void setPid(short pid) {
		this.pid = (pid>0 ? pid : 0);
	}
	void setPhone(String phone) {
		if(phone.length()==5) {
			if(phone.charAt(0)==0 || phone.charAt(0)==1 || phone.charAt(0)==2) {
				this.phone = phone;
			}else this.phone = "00000";
		}else this.phone = "00000";
	}
	void setDepartment(String department) {
		if(department.length()==1) {
			//System.out.println(department.charAt(0));
			if(department.charAt(0)>65 & department.charAt(0)<90) {
				this.department = department;
			}else this.department = "A";
		}else this.department = "A";
	}
	void setSalary(int salary) {
		this.salary = (salary>=30000 ? salary : 30000);
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
		setPid(pid);
		setPhone(phone);
		setDepartment(department);
		setSalary(salary);
	}
	Employee(String name,int age,short pid,String phone,String department,int salary){
		super.setName(name);
		super.setAge(age);
		setPid(pid);
		setPhone(phone);
		setDepartment(department);
		setSalary(salary);
	}
	Employee(){
		this(null, 0, 0, 0,(short)0,"00000","A", 30000);
	}
	
	public void showProfile() {
		super.showProfile();
		System.out.print("人事編號"+pid+"\n分機號碼："+phone+"\n部門"+department+"\n薪資"+salary);
	}

}
